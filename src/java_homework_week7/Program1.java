package java_homework_week7;
import java.util.Scanner;
/**
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */
public class Program1 {
         public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a number : ");
            int number = scan.nextInt();
            // userd ternary operator to cheak enter number is odd or even
            String result = (number % 2 == 0) ? "even" : "odd";
            System.out.println(number + " is " + result);
            scan.close();
        }
}
