package com.company;

import java.util.Scanner;

/*
* Напишите программу, где пользователь вводит любое целое положительное число n. А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
* */
public class HomeWork8 {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number <= 0)
            return;
        int result = 0;

        for (int i = 1; i <= number; i++)
        {
            if (i % 2 != 0)
                result += i;
        }

        System.out.println(result);
    }
}
