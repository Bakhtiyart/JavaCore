package com.bakhtiyart.javacore.chapter18;

import java.util.Iterator;
import java.util.Stack;

public class Task_2 {
    public static void main(String[] args) {
        String str1 = "[({})]";
        String str2 = "[(){}";

       analyzerBrackets(str1);
       analyzerBrackets(str2);

    }
    public static void analyzerBrackets(String str){
        Stack<Character> st = new Stack<>();
        for (int i=0; i<str.length(); i++) {
            st.push(str.charAt(i));
        }
        System.out.println(st.size());
        System.out.println(st);
    }
}
