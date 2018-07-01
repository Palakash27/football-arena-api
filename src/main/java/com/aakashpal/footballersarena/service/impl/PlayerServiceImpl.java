package com.aakashpal.footballersarena.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aakashpal.footballersarena.dao.PlayerRepository;
import com.aakashpal.footballersarena.model.PlayerModel;
import com.aakashpal.footballersarena.service.PlayerService;

@Service("playerService")
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository playerRepo;

	@Override
	public List<PlayerModel> getPlayers() {
		return this.playerRepo.findAll();
	}

	@Override
	public PlayerModel getPlayers(String name) {
		Optional<PlayerModel> optionalPlayer = this.playerRepo.findById(name);
		if (optionalPlayer.isPresent()) {
			return optionalPlayer.get();
		} else {
			return null;
		}

	}

}
