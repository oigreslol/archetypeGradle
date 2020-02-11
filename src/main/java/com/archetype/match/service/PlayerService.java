package com.archetype.match.service;

import com.archetype.match.model.repository.PlayerRepository;
import com.archetype.match.model.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PlayerService{

  @Autowired
  public PlayerRepository playerRepository;

  public List<Player> findAllPlayer(){
    return StreamSupport.stream(playerRepository.findAll().spliterator(), false)
            .collect(Collectors.toList());
  }

}
