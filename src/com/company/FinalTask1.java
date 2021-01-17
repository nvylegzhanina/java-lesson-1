package com.company;

import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите стоимость доллара в рублях");
        double currencyCoefficient = in.nextDouble();
        System.out.println("Введите количество рублей");
        int rublesCount = in.nextInt();
        System.out.println("Курс доллара: " + currencyCoefficient);
        System.out.println("Количество рублей: " + rublesCount);
        System.out.printf("Итого: %.2f", (double)rublesCount / currencyCoefficient);
    }
}
