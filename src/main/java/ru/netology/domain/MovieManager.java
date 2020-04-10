package ru.netology.domain;

public class MovieManager {
    private int neededQuantityOfFilmsToAdd = 3;

    Movie[] list = {new Movie(1, "Onward", "cartoon"),
            new Movie(2, "Bladshort", "action"),
            new Movie(3, "Gentlemen", "action"),
            new Movie(4, "Invisible", "Thriller"),
            new Movie(5, "Troll's tour", "cartoon"),
            new Movie(7, "I BelieveInLove", "romance"),
            new Movie(8, "MyFriendMrPercivalle", "children")};

    public Movie[] addFilm(Movie film) {
        int length = list.length + 1;
        Movie[] addedFilm = new Movie[length];
        for (int i = 0; i < list.length; i++) {
            addedFilm[i] = list[i];
        }
        int lastIndex = addedFilm.length - 1;
        addedFilm[lastIndex] = film;
        list = addedFilm;
        return list;
    }
}
