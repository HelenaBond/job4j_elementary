package ru.job4j.condition;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }

    public String sanity(String ternaryBool) {
        switch (ternaryBool) {
            case "TRUE":
                return "sane";
            default :
                return "This is ridiculous!";
        }
    }

    public String sanity2(String ternaryBool) {
        String result = switch (ternaryBool) {
            case "TRUE", "FALSE" -> {
                yield "sane"; }
            default -> {
                yield "This is ridiculous!"; }
        };
        return result;
    }

    //старый синтаксис
    public boolean sanity3(String ternaryBool) throws IOException {
        boolean result;
        switch (ternaryBool) {
            case "TRUE":
                result = true;
                break;
            case "FALSE":
                result = false;
                break;
            case "FILE_NOT_FOUND":
                // объявление переменной для демонстрации проблемы в default
                var ex = new IOException("This is ridiculous!",
                        new FileNotFoundException());
                throw ex;
            default:
                // А вот и проблема: мы не можем объявить еще одну переменную с именем ex
                var ex2 = new IllegalArgumentException("Seriously?!");
                throw ex2;
        }
        return result;
    }
}
