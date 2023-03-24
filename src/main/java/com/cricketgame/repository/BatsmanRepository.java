package com.cricketgame.repository;

import com.cricketgame.model.Batsman;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface BatsmanRepository extends MongoRepository<Batsman,String> {
    List<Batsman> findByBatsmanCountry(String country);
}
