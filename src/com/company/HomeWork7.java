package com.company;

import java.util.Scanner;

/*
* Напишите программу:

Пользователь вводит размер массива и данные с клавиатуры в массив

Сравнить элементы массива с заранее заданными константами x, y, z.

Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".

* */
public class HomeWork7 {
    public static void main(String[] args) {
        final int x = 10;
        final int y = 11;
        final int z = 12;

        System.out.println("Введите размер массива");
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int[] array = new int[arrayLength];

        for(int i = 1; i <= arrayLength; i++){
            System.out.println("Введите число");
            array[i-1] = in.nextInt();
        }

        for (int i : array) {
            if (i == x || i == y || i == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
