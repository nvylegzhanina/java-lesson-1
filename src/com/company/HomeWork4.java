package com.company;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        double average = (x + y + z) / 3;

        System.out.println(average);

        int dividedInteger = (int) Math.floor(average / 2);
        if (dividedInteger > 3)
            System.out.println("Программа выполнена корректно");
    }
}
