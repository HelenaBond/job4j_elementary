package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int xArg = x2 - x1;
        int yArg = y2 - y1;
        long xArgSquare = (long) Math.pow(xArg, 2);
        long yArgSquare = (long) Math.pow(yArg, 2);
        long resultSquare = xArgSquare + yArgSquare;
        double result = Math.sqrt(resultSquare);
        return result;
}

public static void main(String[] args) {
    double result = Point.distance(0, 0, 2, 0);
    System.out.println("result (0, 0) to (2, 0) " + result);
}
}
