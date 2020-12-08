package com.company;

public class HomeWork3 {
    /*Выполните следующие действия с массивом:

Задайте массив из 5 любых целых чисел.
Поменяйте местами первый и последний элемент в массиве.
Вывести в консоль результат суммы первого и среднего элемента.
Примечание : Для получения последнего и среднего элементов в массиве используйте свойство length.*/
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int lastNumIndex = nums.length - 1;
        int firstNum = nums[0];

        nums[0] = nums[lastNumIndex];
        nums[lastNumIndex] = firstNum;

        System.out.println("sum is: " + (nums[0] + nums[lastNumIndex / 2]));
    }
}
