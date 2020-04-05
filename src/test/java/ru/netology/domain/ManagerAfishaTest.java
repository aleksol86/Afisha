package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ManagerAfishaTest {

    ManagerAfisha managerAfisha = new ManagerAfisha();
    AfishaData film = new AfishaData(9, "For all Mankind", "serial");

    @Test
    void addFilm() {
        AfishaData[] actual = managerAfisha.addFilm(film);
        AfishaData[] expected = {new AfishaData(1, "Onward", "cartoon"),
                new AfishaData(2, "Bladshort", "action"),
                new AfishaData(3, "Gentlemen", "action"),
                new AfishaData(4, "Invisible", "Thriller"),
                new AfishaData(5, "Troll's tour", "cartoon"),
                new AfishaData(7, "I BelieveInLove", "romance"),
                new AfishaData(8, "MyFriendMrPercivalle", "children"),
                new AfishaData(9, "For all Mankind", "serial")};
        assertArrayEquals(expected, actual);
    }

    @Test
    void showAddedFilms() {
        managerAfisha.addFilm(film);
        AfishaData[] actual = managerAfisha.showAddedFilms();
        AfishaData[] expected = {new AfishaData(7, "I BelieveInLove", "romance"),
                new AfishaData(8, "MyFriendMrPercivalle", "children"),
                new AfishaData(9, "For all Mankind", "serial")};
    }
}
