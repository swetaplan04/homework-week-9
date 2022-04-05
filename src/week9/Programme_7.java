package week9;
/* 7. Write a Java program to test an array list is empty or not. Define array list with underground tube names. */

import java.util.ArrayList;

public class Programme_7 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Bakerloo Line");
        list.add("Central Line");
        list.add("Circle Line");
        list.add("District Line");
        list.add("Jubilee Line");
        list.add("Piccadilly Line");

        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
        list.add("Circle Line");
    }
}
