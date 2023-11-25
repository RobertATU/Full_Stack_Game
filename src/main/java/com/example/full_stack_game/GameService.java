package com.example.full_stack_game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GameService {
    @Autowired
    private GameRepo gameRepo;
    public List<Game>allGames(){
        System.out.println(gameRepo.findAll().toString());
        return gameRepo.findAll();
    }
}
