package java_homework_week7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Program8 {
    public static void main(String[] args) {
        Program8 obj = new Program8();
            obj.AtoF();
    }
        public static  void AtoF(){

            Scanner scan = new Scanner(System.in);
            char ch = scan.next().charAt(0);
            System.out.println("Enter any alphabet 'A'TO'F' : ");
            if (ch == 'A') {
                System.out.println("Anand");
            } else if (ch == 'B') {
                System.out.println("Baroda");
            } else if (ch == 'C') {
                System.out.println("Chennai");
            } else if (ch == 'D') {
                System.out.println("Delhi");
            } else if (ch == 'E') {
                System.out.println("Edinburgh");
            } else if (ch == 'F') {
                System.out.println("Florida");
            } else {
                System.out.print("Anyother Cityname Is Doesnot Exists");
            }
            scan.close();
        }
       }


