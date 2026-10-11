package com.ga.stack.exercise1;

import java.util.Arrays;

public class ArrayRotation {

    public static void rotate(int[] array, int d, int n) {

        if (n == 0) {
            return;
        }

        d = d % n;

        for (int i = 0; i < d; i++) {
            int first = array[0];

            for (int j = 0; j < n - 1; j++) {
                array[j] = array[j + 1];
            }

            array[n - 1] = first;
        }
    }

    public static void main(String[] args) {

        int[] array = {100, 200, 300};

        rotate(array, 8, array.length);

        System.out.println(Arrays.toString(array));

        int[] array2 = {1, 2, 3, 4, 5};

        rotate(array2, 2, array2.length);

        System.out.println(Arrays.toString(array2));

        int[] array3 = {11, 24, 30, 41, 55, 62, 78};

        rotate(array3, 10, array3.length);

        System.out.println(Arrays.toString(array3));
    }
}