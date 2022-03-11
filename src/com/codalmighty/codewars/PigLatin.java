package com.codalmighty.codewars;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PigLatin {

    public static String pigIt(String str) {

        String[] words = str.split(" ");
        String out = "";

        for (String word : words) {
            char first = word.charAt(0);
            if (Character.isLetterOrDigit(first)) {
                out += word.substring(1) + first + "ay ";
            } else {
                out += word;
            }
        }

        return out.trim();
    }

    public static void main(String[] args) {

        System.out.println(pigIt("This is a test ![ ]!"));

    }
}
 /*
 public class PigLatin {
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
  */
