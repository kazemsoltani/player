package com.levent.playerapi.service.player.impl;

import java.util.List;

import com.levent.player.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.levent.player.repository.PlayerRepository;
import com.levent.player.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Override
	public List<Player> getplayers() {
		return playerRepository.list();
	}

	@Override
	public Player createplayer(Player player) {
		return playerRepository.create(player);
	}

	@Override
	public Player getplayerById(Long id) {
		return playerRepository.get(id);
	}

	@Override
	public Player updateplayerById(Long id, Player player) {
		return playerRepository.update(id, player);
	}

	@Override
	public Player deleteplayerById(Long id) {
		return playerRepository.delete(id);
	}

}
