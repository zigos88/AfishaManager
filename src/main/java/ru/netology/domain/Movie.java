package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Movie {
    private int Id;
    private String movieId;
    private String nameMovie;
    private String dateOfRelease;
    private String movieUrl;
    private String genre;
}