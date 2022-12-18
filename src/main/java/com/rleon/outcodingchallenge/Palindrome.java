package com.rleon.outcodingchallenge;

import java.io.IOException;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) throws IOException {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String word = inputScanner.nextLine();
        System.out.println("RESPONSE: Is palindrome?: ");
        System.out.println(isPalindrome(word));
    }


    public static boolean isPalindrome(String text) {
        if (text.isEmpty()) {
            return false;
        }
        String newText = text.toLowerCase().replaceAll(" ", "").replaceAll(",", "");
        String reverse = new StringBuilder(newText).reverse().toString();
        return newText.equals(reverse);
    }
}