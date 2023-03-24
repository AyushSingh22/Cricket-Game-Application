package com.cricketgame.repository;

import com.cricketgame.model.Bowler;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface BowlerRepository extends MongoRepository<Bowler,String> {
    List<Bowler> findByBowlerCountry(String country);
}
