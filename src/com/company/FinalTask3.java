package com.company;

import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        System.out.println("Введите количество строк");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] array = new String[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Введите строку");
            String str = in.next();
            array[i] = str;
        }

        int[] uniqueCharsCount = new int[n];

        for(int i = 0; i < array.length; i++) {
            uniqueCharsCount[i] = countUniqueCharacters(array[i]);
        }

        System.out.println(array[getIndexOfLargest(uniqueCharsCount)]);
    }

    public static int getIndexOfLargest( int[] array )
    {
        int largest = 0;
        for ( int i = 1; i < array.length; i++ )
        {
            if ( array[i] > array[largest] ) largest = i;
        }
        return largest;
    }

    public static int countUniqueCharacters(String input) {
        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < input.length(); i++) {
            isItThere[input.charAt(i)] = true;
        }

        int count = 0;
        for (int i = 0; i < isItThere.length; i++) {
            if (isItThere[i] == true){
                count++;
            }
        }

        return count;
    }
}
