package java_homework_week7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Program7 {
    public static void main(String[] args) {
        sale();
    }

    public  static void sale() {
        Scanner scan = new Scanner(System.in);
        int sales_id;
        System.out.println("Enter sales_id: ");
        sales_id = scan.nextInt();
        String seller_name;
        System.out.println("Enter seller_name: ");
        seller_name = scan.next();
        double sales_amount;
        System.out.println("Enter sales_amount: ");
        sales_amount = scan.nextDouble();
        float salary_basic;
        System.out.println("Enter salary_basic: ");
        salary_basic = scan.nextFloat();

        double sales_commissions;
        if (sales_amount > 30000 && sales_amount >= 50000) {
            System.out.println("your commission is " + sales_amount * 35 / 100);
        } else if (sales_amount > 20000 && sales_amount <= 30000) {
            System.out.println("your commission is " + sales_amount * 20 / 100);
        } else if (sales_amount >= 10000 && sales_amount <= 20000) {
            System.out.println("your commission is " + sales_amount * 10 / 100);
        } else if (sales_amount == 10000) {
            System.out.println("your commission is " + sales_amount * 5 / 100);
        } else {
            System.out.println("your commission is " + sales_amount * 2 / 100);
        }
        scan.close();
    }
}

