package com.rleon.outcodingchallenge;

import java.util.stream.IntStream;

public class SumInArray {

    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        createSum(numbers);

    }

    public static void createSum(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(i -> IntStream.range(i + 1, numbers.length)
                        .filter(j -> numbers[i] + numbers[j] == 10)
                        .forEach(j -> System.out.printf("%d + %d = 10%n", numbers[i], numbers[j])));
    }
}