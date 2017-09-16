package ru.job4j.loop;

import org.junit.Test;


public class PaintTestPrintOut {
    @Test

    public static void main(String[] args) {
        Paint paint = new Paint();
        String result = paint.piramid(7);
        System.out.println(result);
    }
}