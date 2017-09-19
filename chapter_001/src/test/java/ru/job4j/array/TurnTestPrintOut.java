package ru.job4j.array;

import java.util.Arrays;

/**Тест класса Turn переворачивающего int массив задом наперёд.
 * Печать одномерного массива int, через представление этого массива строкой.
 */
public class TurnTestPrintOut {

       public static void main(String[] args) {

       int array[] = {1,3,5,9,11,3,2,7};

       Turn turn = new Turn();
       int result[] = turn.back(array);

       String intResultString = Arrays.toString(result);
       System.out.println(intResultString);
    }
}
