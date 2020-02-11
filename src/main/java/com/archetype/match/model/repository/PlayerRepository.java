package com.archetype.match.model.repository;

import com.archetype.match.model.entity.Player;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PlayerRepository extends CrudRepository<Player,Integer>{
    Player findByName(@Param("name") String name);
}