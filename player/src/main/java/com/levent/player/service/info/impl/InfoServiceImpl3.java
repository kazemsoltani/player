package com.levent.player.service.info.impl;

import com.levent.player.service.InfoService;

public class InfoServiceImpl3 implements InfoService {

	@Override
	public String getGreet() {
		return "Player-Api\nVersion: 1.0.0\nWritten by: Levent Divilioglu";
	}

}
