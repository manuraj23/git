package src;
import java.util.Scanner;

public class FDCalculator {
    public static void calculateFD() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter investment amount (Rs.): ");
        
        if (sc.hasNextInt()) {
            int principal = sc.nextInt();
            System.out.print("Enter duration in years: ");
            int years = sc.hasNextInt() ? sc.nextInt() : 1;
            
            double rate = 6.5; // Fixed annual bank interest rate
            double interest = (principal * rate * years) / 100;
            
            System.out.println("\n--- FD Estimate ---");
            System.out.println("Estimated Return Earnings: Rs. " + interest);
            System.out.println("Total value on maturity: Rs. " + (principal + interest));
        } else {
            System.out.println("Enter valid amount / option!");
        }
    }
}
