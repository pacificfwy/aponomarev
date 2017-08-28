package ru.job4j.calculator;

/**	Элементарный калькулятор.
 *
 *	add			метод сложения двух аргументов
 *	subtract	метод вычитания из первого аргумента второго аргумента
 *	div			метод деления первого аргумента на второй аргумента
 *	multiple	метод умножения двух аргументов
 *	getResult	метод возвращает значение поля result
 *
 *	Каждый метод вычисляет арифметическую операцию и записывает ее в поле this.result
 */

public class Calculator {
	/**
	 * внутреннее поле класса для результата арифметических действий.
	 */
	private double result;

	/**
	 * метод сложения.
	 * @param first первый аргумент.
	 * @param second второй аргумент.
	 */
	public void add(double first, double second) {
		this.result = first + second;
	}

	/**
	 * метод вычитания.
	 * @param first первый аргумент.
	 * @param second второй аргумент.
	 */
	public void subtract(double first, double second) {
		this.result = first - second;
	}

	/**
	 * метод деления.
	 * @param first первый аргумент.
	 * @param second второй аргумент.
	 */
	public void div(double first, double second) {
		this.result = first / second;
	}

	/**
	 * метод умножения.
	 * @param first первый аргумент.
	 * @param second второй аргумент.
	 */
	public void multiple(double first, double second) {
		this.result = first * second;
	}

	/**
	 * метод возвращения результата.
	 * @return внутреннее поле класса для результата арифметических действий.
	 */
	public double getResult() {
		return this.result;
	}

}
