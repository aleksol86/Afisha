package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ManagerAfisha {
    private int neededQuantityOfFilmsToAdd = 3;

    AfishaData[] list = {new AfishaData(1, "Onward", "cartoon"),
            new AfishaData(2, "Bladshort", "action"),
            new AfishaData(3, "Gentlemen", "action"),
            new AfishaData(4, "Invisible", "Thriller"),
            new AfishaData(5, "Troll's tour", "cartoon"),
            new AfishaData(7, "I BelieveInLove", "romance"),
            new AfishaData(8, "MyFriendMrPercivalle", "children")};

    AfishaData film = new AfishaData(9, "For all Mankind", "serial");

    public AfishaData[] addFilm(AfishaData film) {
        int length = list.length + 1;
        AfishaData[] addedFilm = new AfishaData[length];
        for (int i = 0; i < list.length; i++) {
            addedFilm[i] = list[i];
        }
        int lastIndex = addedFilm.length - 1;
        addedFilm[lastIndex] = film;
        list = addedFilm;
        System.out.println(list);
        return list;
    }

    public AfishaData[] showAddedFilms() {
        for (int i = list.length - 1; i > list.length - (neededQuantityOfFilmsToAdd + 1) & i >= 0; i--) {
            System.out.print(list[i]);
        }
        return new AfishaData[0];
    }
}
