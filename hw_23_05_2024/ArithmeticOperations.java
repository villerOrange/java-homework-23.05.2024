package org.example.hw_23_05_2024;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Вызов методов для выполнения арифметических операций
        System.out.println("Сложение: " + add(a, b));
        System.out.println("Вычитание: " + subtract(a, b));
        System.out.println("Умножение: " + multiply(a, b));
        System.out.println("Деление: " + divide(a, b));
    }

    // Метод для сложения двух чисел
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Метод для вычитания двух чисел
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Метод для умножения двух чисел
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Метод для деления двух чисел
    public static double divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Ошибка: Деление на ноль.");
            return 0;
        }
        return (double) num1 / num2;
    }
}
