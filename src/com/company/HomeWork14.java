package com.company;

/*
* Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:


Выведите максимальный и минимальный элемент массива.

Из максимального и минимального значения выведите наибольшее по модулю.
* */

import java.util.Random;

public class HomeWork14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[14];

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(40) - 20;
            System.out.println(array[i]);
        }

        int min = 20;
        int max = -20;

        for (int number : array) {
            if (number > max)
                max = number;
            if (number < min)
                min = number;
        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);

        System.out.println(Math.abs(max) > Math.abs(min) ? "Module: " + max : "Module: " + min);
    }
}
