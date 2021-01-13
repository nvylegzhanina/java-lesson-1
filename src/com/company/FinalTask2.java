package com.company;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        System.out.println("Введите выражение");
        Scanner in = new Scanner(System.in);
        String expression = in.nextLine();
        int xPosition = expression.indexOf('x');
        char[] array = expression.toCharArray();

        switch (xPosition) {
            case 0:
                System.out.println(invertSign(array[1], Character.getNumericValue(array[4]), Character.getNumericValue(array[2])));
                break;
            case 2:
                int result = invertSign(array[1], Character.getNumericValue(array[4]), Character.getNumericValue(array[0]));
                System.out.println(result);
                break;
            case 4:
                switch (array[1]) {
                    case '+':
                        System.out.println(Character.getNumericValue(array[0]) + Character.getNumericValue(array[2]));
                        break;
                    case '-':
                        System.out.println(Character.getNumericValue(array[0]) - Character.getNumericValue(array[2]));
                        break;
                    case '*':
                        System.out.println(Character.getNumericValue(array[0]) * Character.getNumericValue(array[2]));
                        break;
                    case '/':
                        System.out.println(Character.getNumericValue(array[0]) / Character.getNumericValue(array[2]));
                        break;
                }

                break;
        }
    }

    private static int invertSign(char sign, int x, int y){
        switch (sign){
            case '+': return x - y;
            case '-': return x + y;
            case '*': return x / y;
            case '/': return x * y;

            default: throw new NotImplementedException();
        }
    }
}
