package com.levent.player.service.info.impl;

import com.levent.player.service.InfoService;

public class InfoServiceImpl1 implements InfoService {

	@Override
	public String getGreet() {
		return "Player-Api version 1 is up and running.";
	}

}
