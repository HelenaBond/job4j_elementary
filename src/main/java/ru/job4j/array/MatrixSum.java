package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int[] numbers : array) {
            for (int num : numbers) {
                result += num;
            }
        }
        return result;
    }
}
