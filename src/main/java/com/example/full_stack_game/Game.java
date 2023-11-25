package com.example.full_stack_game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Games")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @Generated
    private ObjectId id;

    private int gameId;

    private String title;

    private String genre;

    private String age_rating;

    private int release_year;

    private String review;

    private String cover_image;



}
