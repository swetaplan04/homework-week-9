package week9;
/*
4. Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop.
 */
import java.util.ArrayList;

public class Programme_4_ArrayList {

    public static void main(String[] args) {
        //create ArrayList
        ArrayList<String> colors = new ArrayList<String>();
        //add elements to the ArrayList using add method
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Orange");
        //print the ArrayList
        for (String element : colors) {
            System.out.println(element);
        }
    }
}






















