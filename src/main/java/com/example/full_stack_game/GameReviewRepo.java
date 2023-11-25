package com.example.full_stack_game;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameReviewRepo extends MongoRepository<Review, ObjectId> {
}
