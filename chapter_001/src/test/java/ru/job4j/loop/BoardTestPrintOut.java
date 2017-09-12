package ru.job4j.loop;

import org.junit.Test;


public class BoardTestPrintOut {
    @Test

    public static void main(String[] args) {
        Board board = new Board();
        String result = board.paint(15, 10);
        System.out.println(result);
    }
}