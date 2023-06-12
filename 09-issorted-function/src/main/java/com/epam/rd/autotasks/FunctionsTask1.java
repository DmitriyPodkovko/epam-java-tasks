package com.epam.rd.autotasks;

class FunctionsTask1 {
    public static boolean isSorted(int[] array, SortOrder order) {
        if (array != null || order != null) if (array.length != 0) {
            boolean sorted = false;
            switch (order) {
                case ASC: {
                    for (int i = 0; i < array.length - 1; i++) {
                        if (array[i] <= array[i + 1]) {
                            if (i == array.length - 2) sorted = true;
                        } else break;
                    }
                    break;
                }
                case DESC: {
                    for (int i = 0; i < array.length - 1; i++) {
                        if (array[i] >= array[i + 1]) {
                            if (i == array.length - 2) sorted = true;
                        } else break;
                    }
                    break;
                }
            }
            return sorted;
        }
        throw new IllegalArgumentException();
    }
}
