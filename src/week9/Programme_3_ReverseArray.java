package week9;
/* 3. Write a Java program to reverse an array of integer values.*/

public class Programme_3_ReverseArray {

    public static void main(String[] args) {
        //Initialize array
        int[] arr = new int[]{5, 6, 8, 3, 4};
        System.out.println("Array in reverse order: ");
        for(int i = arr.length-1; i >= 0; i--)
        {
            System.out.println(arr[i] + " ");
        }
    }
}
