package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        //тест, проверяющий переворот массива с чётным числом элементов.
        Turn turn = new Turn();
        int[] array = {4, 3, 2, 1};
        int[] resultTest = {1, 2, 3, 4};
        int[] result = turn.back(array);
        assertThat(result, is(resultTest));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //тест, проверяющий переворот массива с нечётным числом элементов.
        Turn turn = new Turn();
        int[] array = {8, 4, 3, 2, 1};
        int[] resultTest = {1, 2, 3, 4, 8};
        int[] result = turn.back(array);
        assertThat(result, is(resultTest));
    }
}