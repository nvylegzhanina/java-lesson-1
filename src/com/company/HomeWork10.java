package com.company;

import java.util.Scanner;

/*
* Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
* а после этого произведите вывод первой строки матрицы на экран,
* где каждый элемент умножается на 3.
* Размерность матрицы задается пользователем.
* */
public class HomeWork10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину матрицы");
        int maxtrixLength = in.nextInt();
        System.out.println("Введите глубину матрицы");
        int maxtrixDeep = in.nextInt();

        int[][] maxtrix = new int[maxtrixLength][maxtrixDeep];
        double sum = 0;

        for(int i = 0; i <= maxtrixLength - 1; i++){
            for (int z = 0; z <= maxtrixDeep - 1; z++){
                System.out.println("Введите число");
                maxtrix[i][z] = in.nextInt();
            }
        }

        for (int i = 0; i <= maxtrixLength - 1; i++){
            System.out.println(maxtrix[i][0] * 3);
        }
    }
}
