package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RotateArrayTest {
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        //тест, проверяющий поворот массива размером 2 на 2.
        RotateArray rotatearray = new RotateArray();
        int[][] array = {{1,2},{3,4}};
        int[][] resultTest = {{3,1},{4,2}};
        int[][] result = rotatearray.rotate(array);
        assertThat(result, is(resultTest));
    }

    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        //тест, проверяющий поворот массива размером 3 на 3.
        RotateArray rotatearray = new RotateArray();
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] resultTest = {{7,4,1},{8,5,2},{9,6,3}};
        int[][] result = rotatearray.rotate(array);
        assertThat(result, is(resultTest));
    }
}

