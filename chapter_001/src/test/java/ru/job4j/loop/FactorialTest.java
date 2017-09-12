package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {

        //создаём объкт класса Factorial и передаём в него аргумент
        Factorial factorial = new Factorial();

        double result = factorial.calc(5);

        // Задаем ожидаемый результат.
        double expected = 120;

        //Проверяем результат и ожидаемое значение.
        assertThat(result, is(expected));


    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {

        //создаём объкт класса Factorial и передаём в него аргумент
        Factorial factorial = new Factorial();

        double result = factorial.calc(0);

        // Задаем ожидаемый результат.
        double expected = 1;

        //Проверяем результат и ожидаемое значение.
        assertThat(result, is(expected));
    }
}