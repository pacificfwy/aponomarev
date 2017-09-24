package ru.job4j.array;

import java.util.Arrays;
/**
 * Класс удаляет дубликаты из строчного массива.
 */
public class ArrayDuplicate {

    public String[] remove(String[] array){

    int length = array.length;

                for(int indexExt=0; indexExt<length; indexExt++){

                    for(int indexInt = indexExt+1; indexInt<length; indexInt++ ){//сравнивать нужно с соседним элементом справа. поэтому цикл начинаем с его номера в массиве.
                            if(array[indexExt].equals(array[indexInt])){//сравнение двух элементов массива.
                                array[indexInt] = array[length-1];//меняем элемент-дубликат местами с последним элементом массива.
                                length--;//"обрезаем" массив справа на 1. там "остаётся" элемент-дубликат.
                                indexInt--;//возвращаемся на 1 итерацию назад, для проверки дублируется ли первый и новый второй элемент, после замены второго элемента с последним.
                            }
                    }

                }
        return  Arrays.copyOf(array,length);//возвращается массив c новым размером length.
    }
}
