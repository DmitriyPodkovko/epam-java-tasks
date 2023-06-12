package com.epam.rd.autotasks.task02;

public class Task02 {

    public static int maximumDistance(int[] array) {
        if (array != null) if (array.length != 0) {
            int maxVal = array[0];
            int maxPosFirst = 0, maxPosSecond = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (maxVal < array[i + 1]) {
                    maxVal = array[i + 1];
                    maxPosFirst = maxPosSecond = i + 1;
                } else if (maxVal == array[i + 1]) {
                    maxPosSecond = i + 1;
                }
            }
            return maxPosSecond - maxPosFirst;
        }
        return 0;
    }

    public static void main(String[] args) {
        {
            int[] array = null;
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[]{};
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[]{4, 100, 3, 4};
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[]{5, 50, 50, 4, 5};
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[]{5, 350, 350, 4, 350};
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[]{10, 10, 10, 10, 10};
            System.out.println("result = " + maximumDistance(array));
        }
    }

}
