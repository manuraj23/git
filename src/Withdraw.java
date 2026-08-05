package src;
import java.util.*; 

import java.util.Scanner;

public class Withdraw {
    public static int withdrawMoney(int balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amount to withdraw: ");
        int amount = scanner.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient Balance!!!");
            return balance;
        } else {
            System.out.println("Amount WithDrawn Sucessfully!!!");
            balance -= amount;
            System.out.println("Your current balance is: " + (balance));
            return balance;
        }
    }
}