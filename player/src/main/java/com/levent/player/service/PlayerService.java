package com.levent.player.service;

import java.util.List;

import com.levent.player.model.Player;
import org.springframework.stereotype.Service;


public interface PlayerService {
	
	List<Player> getplayers();
	Player createplayer(Player player);
	Player getplayerById(Long id);
	Player updateplayerById(Long id, Player player);
	Player deleteplayerById(Long id);

}
