package com.company;

import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        double currencyCoefficient = 73.95;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество рублей");
        int rublesCount = in.nextInt();
        System.out.println("Курс доллара: " + currencyCoefficient);
        System.out.println("Количество рублей: " + rublesCount);
        System.out.printf("Итого: %.2f", (double)rublesCount * currencyCoefficient);
    }
}
