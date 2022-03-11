package com.codalmighty.codewars;

import java.util.Arrays;

public class DeadFish {
    public static int[] parse(String data) {

        int[] ints = new int[]{};

        int count = 0;

        char[] chars = data.toCharArray();

        for (char cmd : chars) {

            if (cmd == 'i') {
                count++;
            }
            if (cmd == 'd') {
                count--;
            }
            if (cmd == 's') {
                count *= count;
            }
            if (cmd == 'o') {
                ints = addElem(ints, count);
            } else {
                continue;
            }
        }

        return ints;
    }

    public static int[] addElem(int[] oldArray, int num) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        newArray[oldArray.length] = num;

        return newArray;
    }

    public static void main(String[] args) {
        int[] test1 = DeadFish.parse("iiisdoso");
        int[] test2 = DeadFish.parse("iiisdosodddddiso");

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
    }
}

/*
public class DeadFish {
  public static int[] parse(String data) {
    int value = 0;
    List<Integer> result = new ArrayList<>();
    for(char letter : data.toCharArray()) {
      switch(letter) {
        case 'i': value++; break;
        case 'd': value--; break;
        case 's': value *= value; break;
        case 'o': result.add(value); break;
        default: throw new IllegalArgumentException("Not valid code letter");
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
 */
