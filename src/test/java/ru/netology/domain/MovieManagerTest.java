package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {
    private final Movie one = new Movie(1, "one1", "name1", "01.02.1994", "Url1", "horror");
    private final Movie two = new Movie(2, "two2", "name2", "02.01.2010", "Url2", "comedy");
    private final Movie three = new Movie(3, "tree3", "name3", "07.01.2021", "Url3", "western");
    private final Movie four = new Movie(4, "four4", "name4", "06.02.2022", "Url4", "thriller");
    private final Movie five = new Movie(5, "five5", "name5", "05.01.2022", "Url5", "action");
    private final Movie six = new Movie(6, "six6", "name6", "06.01.2022", "Url6", "romance");
    private final Movie seven = new Movie(7, "seven7", "name7", "10.03.2015", "Url7", "drama");
    private final Movie eight = new Movie(8, "eight8", "name8", "08.01.2022", "Url8", "horror");
    private final Movie nine = new Movie(9, "nine9", "name9", "09.01.2022", "Url9", "drama");
    private final Movie ten = new Movie(10, "ten10", "name10", "10.01.2022", "Url10", "comedy");
    private final Movie eleven = new Movie(11, "eleven11", "name11", "11.01.2022", "Url11", "comedy");

    @Test
    public void shouldViewLastMovieOverTen() {
        MovieManager manager = new MovieManager();
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(eleven);
        Movie[] actual = manager.lastMovie(11);
        Movie[] expected = new Movie[]{eleven, ten, nine, eight, seven, six, five, four, three, two, one};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldViewLastMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        Movie[] actual = manager.lastMovie(10);
        Movie[] expected = new Movie[]{ten, nine, eight, seven, six, five, four, three, two, one};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldViewLastMovieUnderTen() {
        MovieManager manager = new MovieManager();
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        Movie[] actual = manager.lastMovie(20);
        Movie[] expected = new Movie[]{eight, seven, six, five, four, three, two, one};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldViewLastMovieFive() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        Movie[] actual = manager.lastMovie(5);
        Movie[] expected = new Movie[]{ten, nine, eight, seven, six};
        assertArrayEquals(actual, expected);
    }
    @Test
    void showAllMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        Movie[] actual = manager.findAll();
        Movie[] expected = new Movie[]{one, two, three, four, five, six, seven, eight, nine, ten};
        assertArrayEquals(actual, expected);
    }
}