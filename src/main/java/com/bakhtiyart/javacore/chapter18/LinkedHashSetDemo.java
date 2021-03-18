package com.bakhtiyart.javacore.chapter18;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //создать хеш-множество
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        //ввести элементы в хеш-множество
        lhs.add("Бета");
        lhs.add("Альфа");
        lhs.add("Эта");
        lhs.add("Гамма");
        lhs.add("Эпсилон");
        lhs.add("Омега");

        System.out.println(lhs);
    }
}
