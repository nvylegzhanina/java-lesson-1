package com.company;

import java.util.Scanner;

/*
* Пользователь вводит размер массива и данные с клавиатуры в массив типа double.

Посчитайте среднее арифметическое элементов массива.

После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
* */
public class HomeWork9 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        double[] array = new double[arrayLength];
        double sum = 0;

        for(int i = 1; i <= arrayLength; i++){
            System.out.println("Введите число");
            array[i-1] = in.nextDouble();
            sum += array[i-1];
        }

        double d = sum / arrayLength;
        System.out.println("Среднее арифметическое " + d);

        for(int i = 0; i <= arrayLength - 1; i++){
            System.out.println(array[i] * d);
        }
    }
}
