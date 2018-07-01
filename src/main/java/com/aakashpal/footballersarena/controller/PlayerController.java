package com.aakashpal.footballersarena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aakashpal.footballersarena.model.PlayerModel;
import com.aakashpal.footballersarena.service.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@GetMapping("/players")
	public List<PlayerModel> getPlayers() {
		return this.playerService.getPlayers();
	}
	
	@GetMapping("/players/{name}")
	public PlayerModel getPlayer(@PathVariable String name) {
		return this.playerService.getPlayers(name);
	}
}
