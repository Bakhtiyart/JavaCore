package com.bakhtiyart.javacore.chapter18;

import java.util.*;

public class ArraysDemo {
    public static void main(String[] args) {
        // Выделить и иницализировать массив
        int array[] = new int[10];
        for (int i = 0; i < 10; i++){
            array[i] = - 3 * i;
        }

        // вывести, отсортировать и снова вывести
        // содержимое массива
        System.out.println("Исходный массив: ");
        display(array);
        Arrays.sort(array);
        System.out.println("Отсортированный массив: ");
        display(array);

        // Заполнить массив и вывести его содержимое
        Arrays.fill(array, 2, 6, -1);
        System.out.println("Массив после вызова метода fill(): ");
        display(array);

        // отсортировать и вывести содержимое массива
        Arrays.sort(array);
        System.out.println("Массив после повторной сортировки: ");
        display(array);

        // выполнить двоичный поиск значение -9
        System.out.println("Значение -9 находится на позиции ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }
    static void display(int array[]){
        for(int i: array){
            System.out.print(i + " ");
            System.out.println();
        }
    }
}
