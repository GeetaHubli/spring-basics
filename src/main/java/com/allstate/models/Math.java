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

    public static int fibonacci(int num) {
//        int firstVal = 0;
//        int secondVal = 1;
//        int retValue = 1;
//        int result = calculateFibonacci(firstVal,secondVal,num, retValue);
//        return result;
        if(num<2)
            return num;
        return fibonacci(num-1) + fibonacci(num-2);
    }

//    private static int calculateFibonacci(int firstVal, int secondVal, int num, int retValue) {
//        if(num != 1) {
//            retValue = firstVal + secondVal;
//            firstVal = secondVal;
//            secondVal = retValue;
//            num--;
//            retValue = calculateFibonacci(firstVal, secondVal, num ,retValue);
//
//            return retValue;
//        }
//        return retValue;
//    }
}
