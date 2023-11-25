package com.example.full_stack_game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.Collections;
import java.util.List;

@Document(collection = "Games")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @Generated
    private ObjectId id;

    private String gameId;

    private String title;

    private String genre;

    private String age_rating;

    private int release_year;


    private String review;


    private String reviews;
    private String cover_image;

    public Game(String gameId, String title, String genre, String age_rating, int release_year, String cover_image) {
        this.gameId = gameId;
        this.title = title;
        this.genre = genre;
        this.age_rating = age_rating;
        this.release_year = release_year;
        this.cover_image = cover_image;
    }
}
