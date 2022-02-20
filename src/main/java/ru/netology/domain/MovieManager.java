package ru.netology.domain;

import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int numOfMovie;

    public MovieManager(int numberOfMovie) {
        this.numOfMovie = 10;
    }

    public MovieManager() {
    }

    public void addMovie(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public Movie[] lastMovie(int numOfMovie) {
        if (movies.length < numOfMovie) {
            Movie[] result = new Movie[movies.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = movies[movies.length - i - 1];
            }
            return result;
        } else {
            {
                Movie[] result = new Movie[numOfMovie];
                for (int i = 0; i < result.length; i++) {
                    result[i] = movies[movies.length - i - 1];
                }
                return result;
            }
        }
    }


    public Movie[] findAll() {
        return movies;
    }
}