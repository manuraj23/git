package src;
import java.util.*; 

public class Withdraw { 
    public static int withdrawMoney(int balance) {
         Scanner scanner = new Scanner(System.in);

          System.out.print("Enter your withdraw amount: ");
           int amount = scanner.nextInt();

           if (amount > balance) {
            System.out.println("you have insufficient Balance");
            return balance;
        } 
        
        
    else  if (balance>=amount){
            System.out.println("Amount WithDrawn Sucessfully!!!");
            balance =balance - amount;
            System.out.println("Your current balance is: " + (balance));
            return balance;}
            
     else {
        System.out.println("Please enter valid amount");
        return balance;
     }   
    
    
}
}