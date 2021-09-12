package com.levent.player.controller;

import java.util.List;

import com.levent.player.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.levent.player.service.PlayerService;
import com.levent.player.service.InfoService;

@RestController
@RequestMapping("api/v1/")
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	@Autowired
	private InfoService greeter;
	
	public PlayerController() {}
	
	@RequestMapping("/test")
	public String test() {
		return greeter.getGreet();
	}
	
	@RequestMapping(value = "players", method = RequestMethod.GET)
	public List<Player> list() {
		return playerService.getplayers();
	}
	
	// crud
	@RequestMapping(value = "players", method = RequestMethod.POST)
	public Player create(@RequestBody Player player) {
		return playerService.createplayer(player);
	}
	
	@RequestMapping(value = "players/{id}", method = RequestMethod.GET)
	public Player get(@PathVariable Long id) {
		return playerService.getplayerById(id);
	}
	
	@RequestMapping(value = "players/{id}", method = RequestMethod.PUT)
	public Player update(@PathVariable Long id, @RequestBody Player shipwreck) {
		return playerService.updateplayerById(id, shipwreck);
	}
	
	@RequestMapping(value = "players/{id}", method = RequestMethod.DELETE)
	public Player delete(@PathVariable Long id) {
		return playerService.deleteplayerById(id);
	}
	
}
