package com.bakhtiyart.javacore.chapter18;
import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // создаем двухсторонюю очередь
        ArrayDeque<String> adq = new ArrayDeque<String>();

        // использовать класс ArrayDeque для органицазии стека
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("Извлечь из стека: ");
        while (adq.peek() != null){
            System.out.println(adq.pop() + " ");
        }
        System.out.println();
    }
}
