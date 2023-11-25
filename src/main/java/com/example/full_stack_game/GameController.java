package com.example.full_stack_game;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/game")
public class GameController {
    private GameService gameService;
    @GetMapping
    public ResponseEntity<List<Game>> allGames(){

        return new ResponseEntity<List<Game>>(gameService.allGames(), HttpStatus.OK);
    }
}
