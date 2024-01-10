package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double semiperimeter = (a + b + c) / 2;
        double squareDataToGeron = semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c);
        return Math.sqrt(squareDataToGeron);
    }

    public static void main(String[] args) {
        double result = area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
