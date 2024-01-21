package ru.job4j.condition;

public class Cinema {
    public static String permission(int age) {
        System.out.println("The age of the customer is : " + age);
        return age >= 18 ? "Welcome to the cinema." : "It is not for you.";
    }

    public static void main(String[] args) {
        System.out.println(Cinema.permission(21));
        System.out.println(Cinema.permission(16));

    }
}
