package ru.job4j.array;
/**
 * Класс переворачивает массив.
 */
public class Turn {
    /**
     * Метод переворачивает массив задом наперёд.
     */
    public int[] back (int[] array){

	 int indexBack=array.length-1;

	 for(int index=0; index<=indexBack; index++){

         int cell             = array[index];
	     int cellBack         = array[indexBack];

		 array[index]         = cellBack;
		 array[indexBack]     = cell;

         indexBack--;
	 }
	 return array;
    }

}