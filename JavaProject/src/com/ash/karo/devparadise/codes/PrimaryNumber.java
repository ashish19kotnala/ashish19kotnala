package com.ash.karo.devparadise.codes;

import java.util.stream.IntStream;

public class PrimaryNumber {

	public static void main(String[] args) {
        int num = 31;
		/*
		 * IntStream.range = Returns a sequential ordered IntStream from startInclusive(inclusive)
		 * to endExclusive (exclusive) by an incremental step of 1.
		 */
        boolean isPrime = IntStream.range(2, (num / 2) + 1)
                .noneMatch(i -> num % i == 0);
        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

}
