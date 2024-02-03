package ru.job4j;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol != input.charAt(i)) {
                result += counter == 1 ? symbol : Character.toString(symbol) + counter;
                counter = 1;
                symbol = input.charAt(i);

            } else {
                counter++;
            }
        }
        if (counter == 1) {
            result += symbol;
        } else {
            result += Character.toString(symbol) + counter;
        }
        return input.length() > 1 ? result : input;
    }
}

