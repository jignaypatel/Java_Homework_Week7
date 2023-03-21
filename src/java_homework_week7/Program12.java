package java_homework_week7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program12 {
    public static void main(String[] args) {
        valuenumber();
    }
    public static void valuenumber() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character/number/symbol: ");
        char ch;
        ch = scan.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("this is an alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("this is a number");
        } else {
            System.out.println("this is a symbol");
        }
        scan.close();
    }
}
