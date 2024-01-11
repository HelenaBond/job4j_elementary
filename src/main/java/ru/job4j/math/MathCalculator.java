package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double minusAndDividing(double first, double second) {
        return minus(first, second) + dividing(first, second);
    }

    public static double sumAndMultiplyAndMinusAndDividing(double first, double second) {
        return sum(first, second) + multiply(first, second) + minus(first, second) + dividing(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы сложения и умножения равен: " + sumAndMultiply(20, 10));
        System.out.println("Результат расчета суммы вычитания и деления равен: " + minusAndDividing(20, 10));
        System.out.println("Результат расчета суммы сложения, умножения, вычитания и деления равен: "
                            + sumAndMultiplyAndMinusAndDividing(20, 10));
    }
}
