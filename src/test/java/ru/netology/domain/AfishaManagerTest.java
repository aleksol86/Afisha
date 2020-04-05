package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class AfishaManagerTest {

    @Mock
    private AfishaRepository list;

    @InjectMocks
    private AfishaManager manager;
    AfishaData firstForTest = new AfishaData(11, "Troll", "children");
    AfishaData secondForTest = new AfishaData(12, "Troll2", "children");
    AfishaData thirdForTest = new AfishaData(13, "Troll3", "children");

    @Test
    void shouldShowAddedFilms() {
        AfishaData[] returned = new AfishaData[]{firstForTest, secondForTest};
        doReturn(returned).when(list).findAll();
        doNothing().when(list).save(thirdForTest);
        manager.addFilm(thirdForTest);
        manager.setNeededQuantityOfFilmsToAdd(2);
        AfishaData[] expected = new AfishaData[]{secondForTest, firstForTest};
        AfishaData[] actual = manager.showAddedFilms();
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldShowAll() {
        AfishaData[] returned = new AfishaData[]{firstForTest, secondForTest};
        doReturn(returned).when(list).findAll();
        AfishaData[] expected = new AfishaData[]{firstForTest, secondForTest};
        AfishaData[] actual = manager.showAll();
        assertArrayEquals(expected, actual);
    }
}
