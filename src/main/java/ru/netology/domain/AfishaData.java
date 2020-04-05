package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AfishaData {
    private int id;
    private String name;
    private String genre;

    @Override
    public String toString() {
        return "Film: " +
                "id " + id + ", " + name + ", " +
                genre + "\n";
    }
}
