package src;
import java.util.*;

public class Deposit {
    public static int deposit(int balance){
        System.out.print("Enter amount to Deposit: ");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount added Successfully!");
            System.out.println("Current balance is: "+ balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        return balance;

    }
}
