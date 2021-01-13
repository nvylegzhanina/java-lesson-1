package com.company;

import java.util.Locale;
import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        String answer = "заархивированный вирус";
        Scanner in = new Scanner(System.in);
        boolean wasAnswerCorrect = false;
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        for (int i = 3; i > 0; i--)
        {
            String userAnswer = in.nextLine();
            if (userAnswer.toLowerCase(Locale.ROOT).equals("подсказка")) {
                switch (i){
                    case 3:
                        System.out.println("zip архив");
                        break;
                    default:
                        System.out.println("Подсказка уже недоступна");
                        break;
                }
                userAnswer = in.nextLine();
            }
            if (userAnswer.toLowerCase(Locale.ROOT).equals(answer)) {
                System.out.println("Правильно");
                wasAnswerCorrect = true;
                break;
            }

            if (i != 1)
                System.out.println("Подумай еще");
        }

        if (!wasAnswerCorrect)
            System.out.println("Обидно. Приходи в другой раз");
    }
}
