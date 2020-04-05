package ru.netology.domain;

public class AfishaRepository {

    private AfishaData[] list = {new AfishaData(1, "Onward", "cartoon"),
            new AfishaData(2, "Bladshort", "action"),
            new AfishaData(3, "Gentlemen", "action"),
            new AfishaData(4, "Invisible", "Thriller"),
            new AfishaData(5, "Troll's tour", "cartoon"),
            new AfishaData(7, "I BelieveInLove", "romance"),
            new AfishaData(8, "MyFriendMrPercivalle", "children")};

    AfishaData film = new AfishaData(9, "For all Mankind", "serial");

    AfishaData[] findAll() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        return list;
    }

    void save(AfishaData film) {
        int length = list.length + 1;
        AfishaData[] addedFilm = new AfishaData[length];
        for (int i = 0; i < list.length; i++) {
            addedFilm[i] = list[i];
        }
        int lastIndex = addedFilm.length - 1;
        addedFilm[lastIndex] = film;
        list = addedFilm;
    }

    AfishaData findByID(int id) {
        for (AfishaData item : list) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    void removeById(int id) {
        boolean b = false;
        for (AfishaData item : list) {
            if (item.getId() == id) {
                b = true;
                break;
            }
        }
        if (b) {
            int length = list.length - 1;
            AfishaData[] newArray = new AfishaData[length];
            int index = 0;
            for (AfishaData item : list) {
                if (item.getId() != id) {
                    newArray[index] = item;
                    index++;
                }
            }
            list = newArray;
        }
    }

    void removeAll() {
        list = new AfishaData[0];
    }
}
