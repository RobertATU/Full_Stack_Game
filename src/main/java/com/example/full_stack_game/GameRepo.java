package com.example.full_stack_game;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GameRepo extends MongoRepository<Game, ObjectId> {
    Optional<Game> findGameByGameId(String gameId);
}
