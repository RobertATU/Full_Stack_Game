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
    @GetMapping
    public ResponseEntity<String> allGames(){

        return new ResponseEntity<String>("Hi", HttpStatus.OK);
    }
}
