package com.example.full_stack_game;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GameService {
    @Autowired
    private GameRepo gameRepo;
    public List<Game>allGames(){
        return gameRepo.findAll();
    }
}
