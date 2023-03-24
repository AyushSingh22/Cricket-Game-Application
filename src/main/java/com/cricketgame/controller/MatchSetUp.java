package com.cricketgame.controller;

import com.cricketgame.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchSetUp {

    @Autowired
    private MatchService matchService;

    @PostMapping("/cricket/start")
    public String teamsAndOvers(@RequestParam String teamOne, @RequestParam String teamTwo, @RequestParam int totalOvers, @RequestParam int players){
        int runsScoredByTeamOne=matchService.match(teamOne,teamTwo,players,totalOvers,Integer.MAX_VALUE);
        int runsScoredByTeamTwo= matchService.match(teamTwo,teamOne,players,totalOvers,runsScoredByTeamOne+1);

        System.out.println("Score of "+teamOne+" is "+runsScoredByTeamOne);
        System.out.println("Score of "+teamTwo+" is "+runsScoredByTeamTwo);

        if(runsScoredByTeamOne>runsScoredByTeamTwo){
            return "Hurray! "+teamOne+" won the match";
        }
        else if(runsScoredByTeamOne<runsScoredByTeamTwo){
            return "Hurray! "+teamTwo+" won the match";
        }
        return "Match between "+teamOne+" and "+teamTwo+" is drawn";
    }
}
