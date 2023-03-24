package com.cricketgame.repository;

import com.cricketgame.model.Match;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
@Component
public interface MatchRepository extends MongoRepository<Match,Long>{
}
