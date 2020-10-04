package ru.geekbrains.lesson2;

public class SecondLesson
{
    public static void main(String[] args) {

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

    }


