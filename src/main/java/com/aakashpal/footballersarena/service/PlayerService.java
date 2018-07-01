package com.aakashpal.footballersarena.service;

import java.util.List;

import com.aakashpal.footballersarena.model.PlayerModel;

public interface PlayerService {

	List<PlayerModel> getPlayers();

	PlayerModel getPlayers(String name);
}
