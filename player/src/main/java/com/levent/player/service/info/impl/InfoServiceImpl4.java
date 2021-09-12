package com.levent.player.service.info.impl;

import java.util.Date;

import com.levent.player.service.InfoService;

public class InfoServiceImpl4 implements InfoService {

	@Override
	public String getGreet() {
		return "Player Api is running: Date: " + new Date();
	}

}
