package ru.geekbrains.lesson2;

import java.util.Arrays;

public class SecondLesson
{
    public static void main(String[] args) {
    // п.1 создаем массив и меняем значения его членов
            int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.print("Заданный массив: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
                if (arr[i] == 0) arr[i] = 1;
                else arr[i] = 0;
            }
            System.out.print("\nИзмененный массив:  ");
            for (int i : arr) {
                System.out.print(i + " ");
            }



    }
    // п.2 создаем массив заданного размера и циклом заполняем его

    // В рамках метода Main выдает ошибку. за пределами метода - результат не выводится в консоль!
    public static void changeArray(int[] inputArray) {
        int[] array = new int[8];
        System.out.print("\n Новый массив: ");
        for (int i = 0, j = 0; i < inputArray.length; i++, j += 3) {
            System.out.print(inputArray[i] + " ");
        }
    }
}


