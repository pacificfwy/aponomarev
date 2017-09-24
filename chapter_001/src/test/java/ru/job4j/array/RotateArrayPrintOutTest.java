package ru.job4j.array;

import java.util.Arrays;

/**
 * Класс печатает двумерный массив int, строками.
 * Тест переворота массива на 90 град. по часовой стрелке.
 */
public class RotateArrayPrintOutTest {

    public static void main(String[] args) {

        int[][] array = {{1,2,3,4,5},{6,7,8,9,0},{1,2,3,4,5},{6,7,8,9,0},{1,2,3,4,5}};

        RotateArray rotatearray = new RotateArray();
        int[][] result = rotatearray.rotate(array);

        for(int x [] : result) {//проходимся по всем строкам x[] массива result

                String intResultString = Arrays.toString(x);
                System.out.println(intResultString);


        }

    }
}
