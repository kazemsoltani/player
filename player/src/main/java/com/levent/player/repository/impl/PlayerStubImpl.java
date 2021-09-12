package com.levent.player.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.levent.player.model.Player;
import org.springframework.stereotype.Repository;

import com.levent.player.repository.PlayerRepository;

@Repository
public class PlayerStubImpl implements PlayerRepository {
	
	private Map<Long, Player> players;
	private Long idIndex;

	public PlayerStubImpl() {
		// init
		players = new HashMap<Long, Player>();
		idIndex = 5L;
		
		// populate players
		Player a = new Player(1L, "Levent", "Divilioglu", 36, false, null);
		players.put(1L, a);
		Player b = new Player(2L, "Hakan", "Yorukoglu", 41, true, "Kut-Tech");
		players.put(2L, b);
		Player c = new Player(3L, "Goktug", "Temur", 32, true, "Alfa-5");
		players.put(3L, c);
		Player d = new Player(4L, "Altug", "Dogan", 27, false, null);
		players.put(4L, d);
		Player e = new Player(5L, "Atilla", "Tanridagi", 29, true, "Kafkas-Tech");
		players.put(5L, e);
	}

	public List<Player> list() {
		return new ArrayList<Player>(players.values());
	}

	public Player create(Player player) {
		idIndex += idIndex;
		player.setId(idIndex);
		players.put(idIndex, player);
		return player;
	}

	public Player get(Long id) {
		return players.get(id);
	}

	public Player update(Long id, Player player) {
		players.put(id, player);
		return player;
	}

	public Player delete(Long id) {
		return players.remove(id);
	}
}
