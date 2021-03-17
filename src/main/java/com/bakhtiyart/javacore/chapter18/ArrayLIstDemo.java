package com.bakhtiyart.javacore.chapter18;
import java.util.*;

public class ArrayLIstDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();

        System.out.println("Начальный размер списочного "
                            + "массива а1: " + a1.size());

        // Ввести элементы в списочный массив
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1, "A2");
        System.out.println("Размер списочного массива"
                            + " после ввода элементов: "
                            + a1.size());
        System.out.println("Содержимое списочного массива а1: " + a1);

        a1.remove("F");
        a1.remove(2);

        System.out.println("Размер списочного массива"
                + "после удаление элементов: "
                + a1.size());

        System.out.println("Содержимое списочного массива а1: " + a1);
    }
}
