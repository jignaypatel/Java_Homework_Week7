package java_homework_week7;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Program13 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num  = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Day is Monday");
                    break;
            case 2:
                System.out.println("Day is Tuesday");
                    break;
            case 3:
                System.out.println("Day is Wednesday");
                    break;
            case 4:
                System.out.println("Day is Thursday");
                    break;
            case 5:
                System.out.println("Day is Friday");
                    break;
            case 6:
                System.out.println("Day is Saturday");
                    break;
            case 7:
                System.out.println("Day is Sunday");
                  break;
            default:
                System.out.println();
                scanner.close();

        }
    }
}

