package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {

    MovieManager managerAfisha = new MovieManager();
    Movie film = new Movie(9, "For all Mankind", "serial");

    @Test
    void addFilm() {
        Movie[] actual = managerAfisha.addFilm(film);
        Movie[] expected = {new Movie(1, "Onward", "cartoon"),
                new Movie(2, "Bladshort", "action"),
                new Movie(3, "Gentlemen", "action"),
                new Movie(4, "Invisible", "Thriller"),
                new Movie(5, "Troll's tour", "cartoon"),
                new Movie(7, "I BelieveInLove", "romance"),
                new Movie(8, "MyFriendMrPercivalle", "children"),
                new Movie(9, "For all Mankind", "serial")};
        assertArrayEquals(expected, actual);
    }
}
