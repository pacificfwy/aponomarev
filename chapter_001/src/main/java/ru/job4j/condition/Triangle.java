package ru.job4j.condition;
/**
 * Вычисление площади треугольника образованного тремя точками.
 * Программа должна учитывать условия невозможности
 * построить треугольник через эти точки.
 */
public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point aArg, Point bArg, Point cArg) {

        this.a = aArg;
        this.b = bArg;
        this.c = cArg;

    }

    /**
     * Метод вычисления расстояния между точками left и right.
     * Для вычисления расстояния используется формула.
     * √(x2 - x1)^2 + (y2 - y1)^2
     * где √ - корень квадратный - метод Math.sqrt().
     * ^ - степень.
     * @param left Точка слева
     * @param right Точка справа.
     * @return расстояние между точками left и right.
     */
    public double distance (Point left, Point right){

        return Math.sqrt(   Math.pow(   (   right.getX()-left.getX()   ),2 ) +
                            Math.pow(   (   right.getY()-left.getY()   ),2 )   );

    }

    /**
     * @param distanceOne   длина отрезка 1.
     * @param distanceTwo   длина отрезка 2.
     * @param distanceThree длина отрезка 3.
     * @return возвращает полу-периметер для
     * использования в методе вычисления площади треугольника area.
     */
    public double halfPerimeter (double distanceOne, double distanceTwo, double distanceThree){
        return (distanceOne+distanceTwo+distanceThree)/2;
    }

    /**
     * Метод вычисляет площадь треугольника.
     * @return Вернуть прощадь, если треугольник существует или -1.
     */
    public double area (){
        double result = -1;
        double distanceOne  = this.distance(this.a, this.b);
        double distanceTwo  = this.distance(this.a, this.c);
        double distanceThree= this.distance(this.b, this.c);
        double p            = this.halfPerimeter(distanceOne, distanceTwo, distanceThree);

        if (this.exist(distanceOne, distanceTwo, distanceThree)){

        result = Math.sqrt(p*(p-distanceOne)*(p-distanceTwo)*(p-distanceThree));

        }
        return result;
    }

    /**
     * @param distanceOne   длина отрезка 1.
     * @param distanceTwo   длина отрезка 2.
     * @param distanceThree длина отрезка 3.
     * @return true если треугольник существует.
     * Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей,
     * каждая сторона не равна нулю.
     */
        private boolean exist(double distanceOne, double distanceTwo, double distanceThree){

        return
                        distanceOne     <   (distanceTwo + distanceThree) &&
                        distanceTwo     <   (distanceOne + distanceThree) &&
                        distanceThree   <   (distanceOne + distanceTwo)   &&

                        distanceOne     >   0 &&
                        distanceTwo     >   0 &&
                        distanceThree   >   0;

    }
}