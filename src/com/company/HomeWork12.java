package com.company;

/*
* Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:


Проверить, содержит ли строка подстроку “Java” (используйте contains()).

Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).

Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).

Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.

Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
* */

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        System.out.println("Введите I like Java!!!");
        Scanner in = new Scanner(System.in);
        String r = in.nextLine();

        boolean contains = r.contains("Java");
        boolean startsWith = r.startsWith("I like");
        boolean endsWith = r.endsWith("!!!");

        if (contains && startsWith && endsWith)
            System.out.println(r.toUpperCase());

        String replacedString = r.replaceAll("a", "o");
        String subString = replacedString.substring(7, 11);

        System.out.println(subString);
    }
}
