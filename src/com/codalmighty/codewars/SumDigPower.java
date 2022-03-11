package com.codalmighty.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {

        List<Long> results = new ArrayList<>();

        long[] numbers = LongStream.rangeClosed(a, b).toArray();

        for (long num : numbers) {
            if (test(num)) {
                results.add(num);
            }
        }

        return results;
    }

    public static boolean test(long num) {

        char[] digits = Long.toString(num).toCharArray();
        long sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += (long)Math.pow(Character.getNumericValue(digits[i]),i+1);
        }

        if (sum == num) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(sumDigPow(1,1000));
//        System.out.println(Character.valueOf('9'));

    }
}

/*
import java.util.List;
import java.util.stream.*;


class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        return LongStream.rangeClosed(a, b)
          .filter(i -> isValid(i))
          .boxed()
          .collect(Collectors.toList());
    }

    private static boolean isValid(long x){
      String value = Long.toString(x);
      return IntStream.range(0, value.length())
         .mapToDouble(i -> Math.pow(Character.getNumericValue(value.charAt(i)), i + 1))
         .sum() == x;
    }
}
 */
