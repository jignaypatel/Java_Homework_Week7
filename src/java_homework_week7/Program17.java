package java_homework_week7;
/**
 * Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Program17 {
    public static void main(String[] args) {
        int[] num ={4,5,7,6,8};
        String[] name = {"yogesh ", "krishna ", "kavya ","bharat"};

        Arrays.toString(num);
        Arrays.toString(name );


        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(name));

        Arrays.sort(num);
        Arrays.sort(name);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(name));
    }
}

