package com.company;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println("Введите X");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Введите Y");
        int y = in.nextInt();
        System.out.println("Введите Z");
        int z = in.nextInt();

        double average = (x + y + z) / 3;

        System.out.println(average);

        int dividedInteger = (int) Math.floor(average / 2);
        if (dividedInteger > 3)
            System.out.println("Программа выполнена корректно");
    }
}
