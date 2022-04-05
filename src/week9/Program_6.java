package week9;

/* 6. Write a Java program to retrieve an element (at a specified index) from a given array list */

import java.util.ArrayList;

public class Program_6 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("Kiaan");
        list.add("Khushi");
        list.add("Tamanna");
        list.add("Bhavya");
        list.add("Pratham");

        System.out.println("The element index in Arraylist is: " + list.get(1));
    }
}
