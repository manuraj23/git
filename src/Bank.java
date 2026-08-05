package src;
import java.util.*;
public class Bank {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to ABC bank");
        int balance = 0; 
        int option=1;
        while(option != 9){
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("Enter your choice");
            System.out.println("1. Check Balance");
            System.out.println("2. Money Deposit");
            System.out.println("3. Withdraw Money");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            option=sc.nextInt();
            System.out.println();

            switch(option){
                case 1:
                    Balance.checkBalance(balance);
                    break;
                case 2:
                    balance = Deposit.deposit(balance);
                    break;
                case 3:
                    Withdraw.withdrawMoney(balance);
                    break;
                case 9:
                    System.out.println("Thank you for using ABC Bank!");
                    break;
                default:
                    System.out.println("Invalid choice- Enter choice from main menu");
            }
        }
    }
}
