package week9;

import java.util.HashMap;
import java.util.Map;

/* 9. Create a HashMap object called people that will store String keys and Integer values: And use for each loop to iterate the value from Map.
*/
public class Programme_9 {
/* 9. Create a HashMap object called people that will store String keys and Integer values: And use for each loop to iterate the value from Map.*/

    public static void main(String[] args) {
        // create a Hashmap
        HashMap<Integer, String> languages = new HashMap();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("HashMap: " + languages);

        // iterate through keys only
        System.out.println("Keys: ");
        for (Integer key : languages.keySet()) {
            System.out.println(key);
            System.out.println(", ");
        }
        //iterate through values only
        System.out.println("\nValues: ");
        for (String value : languages.values()) {
            System.out.println(value);
            System.out.println(", ");
        }
        // iterate through key/value entries
    }
}










