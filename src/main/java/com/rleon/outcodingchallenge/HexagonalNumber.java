package com.rleon.outcodingchallenge;

import java.util.Scanner;

public class HexagonalNumber {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter number:");
        String number = inputScanner.nextLine();
        System.out.println("RESPONSE: the hexagonal number is: ");
        createHexagon(Integer.parseInt(number));
    }

    public static void createHexagon(int number) {
        Integer hexagon = number * ((2 * number) - 1);
        System.out.println(hexagon);
    }
}