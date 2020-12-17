package com.company;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите X");
        int x = in.nextInt();
        System.out.println("Введите Y");
        int y = in.nextInt();
        System.out.println("Введите знак");
        String sign = in.next();

        switch (sign){
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                if (y != 0)
                    System.out.println(x / y);
                else
                    System.out.println("На ноль делить нельзя");
                break;
            default:
                System.out.println("Такого знака мы не знаем :)");
        }
    }
}
