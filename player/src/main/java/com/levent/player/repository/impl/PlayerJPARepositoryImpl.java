package com.levent.player.repository.impl;

import java.util.List;

import com.levent.player.model.Player;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.levent.player.repository.PlayerRepository;

@Primary
@Repository
public class PlayerJPARepositoryImpl implements PlayerRepository {
	
	@Autowired
	@Lazy
	private PlayerJPARepository playerJPARepository;
	
	@Override
	public List<Player> list() {
		System.out.println("JPA Repo: " + playerJPARepository);
		
		return playerJPARepository.findAll();
	}

	@Override
	public Player create(Player player) {
		return playerJPARepository.saveAndFlush(player);
	}

	@Override
	public Player get(Long id) {
		return playerJPARepository.findOne(id);
	}

	@Override
	public Player update(Long id, Player player) {
		Player existingPlayer = playerJPARepository.findOne(id);
		BeanUtils.copyProperties(player, existingPlayer);
		
		return playerJPARepository.saveAndFlush(existingPlayer);
	}

	@Override
	public Player delete(Long id) {
		Player existingPlayer = playerJPARepository.findOne(id);
		playerJPARepository.delete(existingPlayer);
		
		return existingPlayer;
	}

}
