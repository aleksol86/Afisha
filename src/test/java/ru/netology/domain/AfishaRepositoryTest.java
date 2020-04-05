package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AfishaRepositoryTest {

    AfishaRepository repo = new AfishaRepository();

    @Test
    void shouldFindAll() {
        AfishaData[] expected = {new AfishaData(1, "Onward", "cartoon"),
                new AfishaData(2, "Bladshort", "action"),
                new AfishaData(3, "Gentlemen", "action"),
                new AfishaData(4, "Invisible", "Thriller"),
                new AfishaData(5, "Troll's tour", "cartoon"),
                new AfishaData(7, "I BelieveInLove", "romance"),
                new AfishaData(8, "MyFriendMrPercivalle", "children")};
        AfishaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSave() {
        repo.save(repo.film);
        AfishaData[] expected = {new AfishaData(1, "Onward", "cartoon"),
                new AfishaData(2, "Bladshort", "action"),
                new AfishaData(3, "Gentlemen", "action"),
                new AfishaData(4, "Invisible", "Thriller"),
                new AfishaData(5, "Troll's tour", "cartoon"),
                new AfishaData(7, "I BelieveInLove", "romance"),
                new AfishaData(8, "MyFriendMrPercivalle", "children"),
                new AfishaData(9, "For all Mankind", "serial")};
        AfishaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindByID() {
        AfishaData expected = new AfishaData(3, "Gentlemen", "action");
        AfishaData actual = repo.findByID(3);
        assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveById() {
        repo.removeById(4);
        AfishaData[] expected = {new AfishaData(1, "Onward", "cartoon"),
                new AfishaData(2, "Bladshort", "action"),
                new AfishaData(3, "Gentlemen", "action"),
                new AfishaData(5, "Troll's tour", "cartoon"),
                new AfishaData(7, "I BelieveInLove", "romance"),
                new AfishaData(8, "MyFriendMrPercivalle", "children")};
        AfishaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdIfIDDoesNotExist() {
        repo.removeById(11);
        AfishaData[] expected = {new AfishaData(1, "Onward", "cartoon"),
                new AfishaData(2, "Bladshort", "action"),
                new AfishaData(3, "Gentlemen", "action"),
                new AfishaData(4, "Invisible", "Thriller"),
                new AfishaData(5, "Troll's tour", "cartoon"),
                new AfishaData(7, "I BelieveInLove", "romance"),
                new AfishaData(8, "MyFriendMrPercivalle", "children")};
        AfishaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveAll() {
        repo.removeAll();
        AfishaData[] expected = {};
        AfishaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }
}
