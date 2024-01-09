package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static float euroToRuble(float value) {
        float result = value * 70;
        return result;
    }

    public static float dollarToRuble(float value) {
        float result = value * 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(140);
        float rubleFromEuro = euroToRuble(2);
        float rubleFromDollar = dollarToRuble(3);
        System.out.println("140 rubles are " + euro + " euros.");
        System.out.println("140 rubles are " + dollar + " dollars.");
        System.out.println("2 euros are " + rubleFromEuro + " rubles.");
        System.out.println("3 dollars are " + rubleFromDollar + " rubles.");
    }
}
