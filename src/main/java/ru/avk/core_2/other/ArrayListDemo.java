package ru.avk.core_2.other;

import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Начальный размер: " + al.size());

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        al.add(1,"A2");

        System.out.println("Ноый размер массива: " + al.size());
        System.out.println("Элементы массива: " + al);
        
    }
}
