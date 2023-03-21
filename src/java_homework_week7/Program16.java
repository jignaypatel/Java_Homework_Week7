package java_homework_week7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Program16 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer number:");
        num = scanner.nextInt();

        if (num >0){
            System.out.println(num +" is positive number");
        } else if (num<0) {
            System.out.println(num + " is negative number");
        }
        else{
            System.out.println(num + "is a zero");
        }
        scanner.close();

    }

}



