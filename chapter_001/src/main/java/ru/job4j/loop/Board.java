package ru.job4j.loop;

public class Board {
    /**
     * Класс рисует шахматную доску символами х и пробелами.
     * @param width     ширина доски.
     * @param height    высота доски.
     * @return          возвращает массив строк в виде шахматной доски.
     */
    public String paint (int width, int height){


        StringBuilder builder = new StringBuilder();

            for(int indexHeight = 0; indexHeight < height; indexHeight++){

                    for(int indexWidth = 0; indexWidth < width; indexWidth++){

                        builder.append(indexWidth % 2 == 0 && indexHeight % 2 == 0 ||
                                       indexWidth % 2 != 0 && indexHeight % 2 != 0? 'x' : ' ');

                    }

                builder.append(System.getProperty("line.separator"));

            }
        return builder.toString();
    }

}
