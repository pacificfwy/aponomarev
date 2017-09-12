package ru.job4j.loop;

public class Counter {

    /** Метод вычисляет сумму чётных чисел в диапазоне между start и finish.
     * @param start     первое число в диапазоне.
     * @param finish    последнее число в диапазоне.
     * @return add сумма чётных чисел в диапазоне.
     */

    public int add (int start, int finish){
        int add = 0;

        for(int index=start; index <= finish; index++ ){
            if (index % 2 == 0){
                add = add + index;
            }
        }
        return add;
    }
}
