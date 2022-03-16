package com.codalmighty.codewars;

import java.util.Arrays;

public class HexToRGB {

    public static int[] hexStringToRGB(String hex) {

        int[] rgb = new int[3];

        rgb[0] = Integer.parseInt(hex.substring(1,3).toLowerCase(), 16);
        rgb[1] = Integer.parseInt(hex.substring(3,5).toLowerCase(), 16);
        rgb[2] = Integer.parseInt(hex.substring(5,7).toLowerCase(), 16);

        return rgb;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(hexStringToRGB("#FFFFFF")));
        System.out.println(Arrays.toString(hexStringToRGB("#111111")));
        System.out.println(Arrays.toString(hexStringToRGB("#000000")));
        System.out.println(Arrays.toString(hexStringToRGB("#123456")));

    }
}

/*
Best Practice :) !!
 */
