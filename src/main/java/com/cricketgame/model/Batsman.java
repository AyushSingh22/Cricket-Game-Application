package com.cricketgame.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "batsman")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Batsman{
    @Id
    String batsmanId;
    String batsmanName;
    String batsmanCountry;
    int runsScored;
    int ballsFaced;
    int fours;
    int sixes;

}
