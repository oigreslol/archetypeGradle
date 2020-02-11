package com.archetype.match.controller;

import com.archetype.match.service.PlayerService;
import com.archetype.match.model.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class PlayerController {

  @Autowired
  private PlayerService playerService;

  @GetMapping(path="/players")
  public List<Player> getAllPlayers() {
    return playerService.findAllPlayer();
  }

  @RequestMapping("/")
  public String hello() {
    return "Hola mundo";
  }


}
