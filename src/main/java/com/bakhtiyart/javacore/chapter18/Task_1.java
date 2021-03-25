package com.bakhtiyart.javacore.chapter18;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();

        al1.add(6);
        al1.add(4);
        al1.add(6);
        al1.add(8);
        al1.add(1);
        al1.add(100);
        al1.add(-100);

        al2.add(3);
        al2.add(8);
        al2.add(76544);
        al2.add(-42);
        al2.add(100);
        al2.add(1);

        ArrayList<Integer> result = sortColl(al1, al2);
        System.out.println(result);
    }

    public static ArrayList sortColl(ArrayList a, ArrayList b){
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        Integer ia[] = new Integer[a.size()];
        ia = (Integer[]) a.toArray(ia);
        for ( int i: ia ) {
            if (b.contains(i)){
                sorted.add(i);
            }
        }
        return sorted;
    }

    static class MyComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer a, Integer b) {
            return a.compareTo(b);
        }
    }
}
