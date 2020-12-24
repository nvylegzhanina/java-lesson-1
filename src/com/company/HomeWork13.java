package com.company;

/*
* Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:


Выведите слова, состоящие только из латиницы.

Выведите количество этих слов.
* */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork13 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Za-z]");
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int englishWordsCount = 0;

        String[] splittedStr = str.split(" ");

        for (String word : splittedStr) {
            String x = "";
            Matcher matcher = pattern.matcher(word);

            while (matcher.find()) {
                x += word.substring(matcher.start(), matcher.end());
            }

            if (x.length() == word.length()){
                System.out.println(word);
                englishWordsCount++;
            }
        }

        System.out.println(englishWordsCount);
    }
}
