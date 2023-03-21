package java_homework_week7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Program2 {
    public static void main(String[] args) {

        //Variable definition and assignment
        int year = 2007;
        boolean leap = false;
        Scanner scanner = new Scanner(System.in); /* create a object */
        System.out.print("Enter a year: ");
        year = scanner.nextInt();
        //A year divisible by 4 is a leap year
        if (year % 4 == 0) {
            //It is a centenary year if the value is divisible by 100 with no remainder.
            if (year % 100 == 0) {
                //Centenary year is a leap year divided by 400
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            // if the year is not century
            else
                leap = true;
        }
        //The Year is not a leap year
        else
            leap = false;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
        scanner.close();
    }
}


