package com.codalmighty.codewars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExpandedForm {

    public static String expandedForm(int num) {

        int mod = 10;
        int res = 0;

        List<Integer> values = new ArrayList<>();

        while (res < num) {
            res = num % mod;
            if (res > 0) {
                values.add(res);
            }
            num = num - res;
            mod *= 10;
        }
        values.sort(Comparator.reverseOrder());

        return values.stream().map(Object::toString).collect(Collectors.joining(" + "));
    }

    public static void main(String[] args) {

        System.out.println(expandedForm(70304));
        System.out.println(expandedForm(12));
        System.out.println(expandedForm(42));
        System.out.println(expandedForm(9906254));
    }
}

/*
public class Kata
{
    public static String expandedForm(int num)
    {
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;

        return outs;
    }
}
 */
