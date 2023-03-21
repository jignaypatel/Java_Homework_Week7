package java_homework_week7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if
 * else) if
 * any other alphabet should be invalid entry  switch statement.
 */
public class Program9 {
    public static void main(String[] args) {
        Cityname();
    }
    public static void Cityname() {
        Scanner scan = new Scanner(System.in);
        char ch;
        System.out.println("Enter any alphabet starts with 'A'TO'F' : ");
        ch = scan.next().charAt(0);
        switch (ch) {
            case 'A':
                System.out.println("America");
                break;
            case 'B':
                System.out.println("Bombay");
                break;
            case 'C':
                System.out.println("Canada");
                break;
            case 'D':
                System.out.println("Dubai");
                break;
            case 'E':
                System.out.println("England");
                break;
            case 'F':
                System.out.println("France");
                break;

            default:
                System.out.print("Anyother Cityname Is Doesnot Exists");

        }
    }
}


