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

// п.3 задаем массив и проходимся по нему циклом
        int[] ar = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("\nЗаданный массив: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
            if (ar[i] < 6) ar[i] *= 2;
                    }
        System.out.print("\nИзмененный массив:  ");
        /* выдал интересную ошибку. причину так и не нашел:
        Заданный массив: 1 5 3 2 11 4 5 2 4 8 9 1
        Измененный массив:  2 10 6 4 11 8 10 4 8 8 9 2
        */
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        System.out.println("\n Task 2");
        int[] array = new int[8];
        changeArray(array);
        System.out.print(array + " ");

    }


    // п.2 создаем массив заданного размера и циклом заполняем его

        static void changeArray(int[] inputArray) {
        System.out.print("\n Новый массив: ");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = i *3;
            System.out.print(inputArray[i] + " ");
            // результат в консоли:  Новый массив: 0 3 6 9 12 15 18 21 [I@5b6f7412
        }
    }

    // п.4 Задаем квадратную матрицу и заполняем ее диагонали единицами


}


