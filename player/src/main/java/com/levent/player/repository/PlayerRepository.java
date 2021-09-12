package com.levent.player.repository;

import java.util.List;

import com.levent.player.model.Player;

public interface PlayerRepository {
	
	List<Player> list();
	// CRUD
	Player create(Player player);
	Player get(Long id);
	Player update(Long id, Player player);
	Player delete(Long id);
	
}
