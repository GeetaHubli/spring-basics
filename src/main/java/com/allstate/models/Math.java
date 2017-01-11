package com.allstate.models;

import java.util.stream.Stream;

public class Math {

    public static int square(int i) {
        return i * i;
    }

    public static int factorial(int num) {
        Stream<Integer> numListDecrementUntilOne = Stream.iterate(num, n -> n-1)
                .limit(num-1); //n, n-1, n-2,...1

        int result = numListDecrementUntilOne.reduce(1, (acc, val) -> acc * val);
        return result;
    }
}
