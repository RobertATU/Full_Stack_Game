package com.example.full_stack_game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/game")
public class GameController {
    @Autowired
    private GameService gameService;
    @GetMapping
    public ResponseEntity<List<Game>> allGames(){

        return new ResponseEntity<List<Game>>(gameService.allGames(), HttpStatus.OK);
    }

    @GetMapping("/{gameId}")
    public ResponseEntity<Optional<Game>> getSingleGame(@PathVariable String gameId){
        return new ResponseEntity<Optional<Game>>(gameService.findGameById( gameId), HttpStatus.OK);
    }
}
