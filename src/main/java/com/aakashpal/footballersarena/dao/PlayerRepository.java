package com.aakashpal.footballersarena.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aakashpal.footballersarena.model.PlayerModel;

public interface PlayerRepository extends JpaRepository<PlayerModel, String> {

}
