package week9;

/*5. Write a Java program to iterate through all elements in an array list using Iterator.*/

import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5 {

    public static void main(String[] args) {
        //Creating an empty Array list
        ArrayList<Integer> list =new ArrayList();
        // Use add() method to add
        //elements into the list
        list.add(10);
        list.add(12);
        list.add(20);
        list.add(30);
        list.add(5);

        System.out.println("The list is: \n" + list);

        // Create Iterator method for the list
        //using iterator() method
        Iterator<Integer> iter = list.iterator();
        System.out.println("\nThe iterator values" + "of list are: ");
        while(iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }
    }
}
