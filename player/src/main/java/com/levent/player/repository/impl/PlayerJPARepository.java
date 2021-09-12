package com.levent.player.repository.impl;

import com.levent.player.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerJPARepository extends JpaRepository<Player, Long> {
}
