package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AfishaManager {
    private AfishaRepository repo;
    private int neededQuantityOfFilmsToAdd = 3;

    public AfishaManager(AfishaRepository repository) {
        this.repo = repository;
    }

    public void addFilm(AfishaData film) {
        repo.save(film);
    }

    public AfishaData[] showAddedFilms() {
        int c = 0;
        AfishaData[] listNew = new AfishaData[neededQuantityOfFilmsToAdd];
        AfishaData[] all = repo.findAll();
        for (int i = all.length - 1; i > all.length - (neededQuantityOfFilmsToAdd + 1) && i >= 0; i--) {
            listNew[c] = all[i];
            System.out.print(all[i]);
            c++;
        }
        return listNew;
    }

    public AfishaData[] showAll() {
        AfishaData[] all = repo.findAll();
        return all;
    }
}
