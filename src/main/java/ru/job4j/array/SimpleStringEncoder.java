package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol != input.charAt(i)) {
                result += counter == 1 ? Character.toString(symbol) : Character.toString(symbol) + counter;
                counter = 1;
                symbol = input.charAt(i);
                if (i == input.length() - 1) {
                    result += Character.toString(symbol);
                }
            } else {
                if (i == input.length() - 1) {
                    result += Character.toString(symbol) + (counter + 1);
                } else {
                    counter++;
                }
            }
        }
        return input.length() > 1 ? result : input;
    }
}

