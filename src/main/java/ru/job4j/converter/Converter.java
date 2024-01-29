package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float euroToRuble(float value) {
        return value * 70;
    }

    public static float dollarToRuble(float value) {
        return value * 60;
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
        float rubles = 420;
        float euros = 6;
        float dollars = 7;
        float outputRubleToEuro = Converter.rubleToEuro(rubles);
        boolean passedRubleToEuro = euros == outputRubleToEuro;
        System.out.println("420 rubles are 6 euros. Test result : " + passedRubleToEuro);
        float outputRubleToDollar = Converter.rubleToDollar(rubles);
        boolean passedRubleToDollar = dollars == outputRubleToDollar;
        System.out.println("420 rubles are 7 euros. Test result : " + passedRubleToDollar);
        float outputEuroToRuble = Converter.euroToRuble(euros);
        boolean passedEuroToRuble = rubles == outputEuroToRuble;
        System.out.println("6 euros are 420 rubles. Test result : " + passedEuroToRuble);
        float outputDollarToRuble = Converter.dollarToRuble(dollars);
        boolean passedDollarToRuble = rubles == outputDollarToRuble;
        System.out.println("7 dollars are 420 rubles. Test result : " + passedDollarToRuble);
    }
}
