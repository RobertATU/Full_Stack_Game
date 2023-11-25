package com.example.full_stack_game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {
    @Autowired
    private GameRepo gameRepo;
    public List<Game>allGames(){
        System.out.println(gameRepo.findAll().toString());
        return gameRepo.findAll();
    }

    public Optional<Game> findGameById(String gameId) {
        return gameRepo.findGameByGameId(gameId);
    }

}
