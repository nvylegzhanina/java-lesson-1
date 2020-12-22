package com.company;

/*
* Напишите программу:

Ввести первое  число с клавиатуры и записать его в строковую переменную.

Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.

Сравнить 2 числа и вывести большее на экран .

Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.

* */

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner in = new Scanner(System.in);
        String first = Integer.toString(in.nextInt());
        System.out.println("Введите второе число");
        int second = in.nextInt();

        if (Integer.parseInt(first) > second){
            System.out.println(first);
            System.out.println((double) second);
        }
        else if (Integer.parseInt(first) < second){
            System.out.println(second);
            System.out.println((double) Integer.parseInt(first));
        }
        else System.out.println("Числа равны");
    }
}
