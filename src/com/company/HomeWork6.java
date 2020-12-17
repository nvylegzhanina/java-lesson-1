package com.company;

import java.util.Scanner;

/*1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
> Выберите что переводить: 1 - масса, 2 - расстояние
> 2

2. Пользователю предлагается выбрать единицу измерения. Пример:
> Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
> 1

3. Пользователю предлагается ввести количество выбранных единиц:
> Введите число
> 10
> Результат:
> Метры: 10
> Мили: 0.006
> Ярды: 10.94
> Футы: 32.81*/
public class HomeWork6 {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner in = new Scanner(System.in);
        int quantity = in.nextInt();
        if (quantity == 1){
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - тонна");
            int metric = in.nextInt();
            System.out.println("Введите число");
            int value = in.nextInt();
            switch (metric){
                case 1: {
                    System.out.println("Граммы: " + value);
                    System.out.println("Килограммы: " + ((double)value / 1000));
                    System.out.println("Тонны: " + ((double)value / 1000000));
                    break;
                }
                case 2: {
                    System.out.println("Граммы: " + ((double)value * 1000));
                    System.out.println("Килограммы: " + value);
                    System.out.println("Тонны: " + ((double)value / 1000));
                    break;
                }
                case 3: {
                    System.out.println("Граммы: " + ((double)value * 1000000));
                    System.out.println("Килограммы: " + ((double)value * 1000));
                    System.out.println("Тонны: " + value);
                    break;
                }
            }
        } else if (quantity == 2)
        {
            System.out.println("Выберите единицу измерения: 1 - сантиметр, 2 - метр, 3 - километр");
            int metric = in.nextInt();
            System.out.println("Введите число");
            int value = in.nextInt();
            switch (metric){
                case 1: {
                    System.out.println("Cантиметры: " + value);
                    System.out.println("Метры: " + ((double)value / 100));
                    System.out.println("Километры: " + ((double)value / 100000));
                    break;
                }
                case 2: {
                    System.out.println("Cантиметры: " + ((double)value * 100));
                    System.out.println("Метры: " + value);
                    System.out.println("Километры: " + ((double)value / 1000));
                    break;
                }
                case 3: {
                    System.out.println("Cантиметры: " + ((double)value * 100000));
                    System.out.println("Метры: " + ((double)value * 1000));
                    System.out.println("Километры: " + value);
                    break;
                }
            }
        }
    }
}
