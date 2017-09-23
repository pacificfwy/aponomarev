package ru.job4j.array;

/**
 * Класс поворачивает 2-мерный массив по часовой стрелке.
 */
public class RotateArray {

/**
*	Алгоритм переносит элементы четверти квадрата.
*	
*	Нулевая итерация внутреннего цикла для массива 5х5:
*
*	A * * * B		D * * * A 
*	* * * * *		* * * * *
*	* * * * *		* * * * *
*	* * * * *		* * * * *
*	D * * * C		C * * * B
*
*/

    public int[][] rotate (int[][] array){
	
	int length = array.length;
	
		//выполняем внешний цикл до достижения высоты четверти квадрата:
		for (int indexExt = 0; indexExt <(length+1)/2; indexExt++)	{
			
			//выполняем внутренний цикл до достижения ширины четверти квадрата:
			for (int indexInt = 0; indexInt < length/2; indexInt++){
					
			//меняем местами по часовой стрелке четыре соответствующих элемента массива на 90 градусов:
			int cell = array[indexInt][indexExt];
			
			array[indexInt][indexExt]					= array[length-1-indexExt][indexInt];
			array[length-1-indexExt][indexInt]			= array[length-1-indexInt][length-1-indexExt];
			array[length-1-indexInt][length-1-indexExt]	= array[indexExt][length-1-indexInt];
			array[indexExt][length-1-indexInt]			= cell;
			}
		
		}
		return array;
    }
}
