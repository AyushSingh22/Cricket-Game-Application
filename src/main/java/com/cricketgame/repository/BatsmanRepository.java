package com.cricketgame.repository;

import com.cricketgame.model.Batsman;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
@EnableElasticsearchRepositories
public interface BatsmanRepository extends ElasticsearchRepository<Batsman,String> {
    List<Batsman> findByBatsmanCountry(String country);
    List<Batsman> findAll();
}
