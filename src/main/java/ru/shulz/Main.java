package ru.shulz;

public class Main {
    public static void main(String[] args) {
        // 1. Переполнение

        byte m = 127;
        System.out.println(++m);

        int c = 2147000000;
        int d = c + 2000000;
        System.out.println(d);

        // 2. Математические операторы

        int f = 32767 / 127;
        System.out.println(f);

        int g = 32767 % 127;
        System.out.println(g);

        // 3. Логические операторы и операторы сравнения

        int[] array = {0, 1, 2, 3, 4};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int hour = 5;
        if (hour <= 10 || hour >= 18) {
            System.out.println("Офис закрыт");
        }

        // 4. Вычисления комбинации разных типов данных (int и double)

        int a = 9;
        double b = 10.3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b - a);
        System.out.println(a / b);
    }
}
