package com.sda.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Problems {
    public static List<Integer>
    primeNumbers(IntStream intStream){
        return intStream.filter(Problems::isPrime).boxed().collect(Collectors.toList());
    }
    public static boolean isPrime(long number) {
        return LongStream.rangeClosed(2, Math.round(Math.sqrt(number))).noneMatch(n -> number % n == 0);
    }
}
