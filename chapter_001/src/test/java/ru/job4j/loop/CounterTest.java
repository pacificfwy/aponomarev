package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {

        //создаём объкт класса Counter и передаём в него аргументы
        Counter counter = new Counter();

        // Вычисляем сумму чётных чисел в диапазоне от 1 до 10.
        double result = counter.add(1,10);

        // Задаем ожидаемый результат.
        double expected = 30;

        //Проверяем результат и ожидаемое значение.
        assertThat(result, is(expected));
    }
}

