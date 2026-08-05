package src;
import java.util.Scanner;

public class PinManager {
    public static int changePin(int currentPin) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your current 4-digit PIN: ");
        
        if (sc.hasNextInt()) {
            int oldPin = sc.nextInt();
            if (oldPin == currentPin) {
                System.out.print("Enter your NEW 4-digit PIN: ");
                if (sc.hasNextInt()) {
                    int newPin = sc.nextInt();
                    System.out.println("Security PIN updated successfully!");
                    return newPin;
                }
            } else {
                System.out.println("Incorrect current PIN! Authentication failed.");
            }
        } else {
            System.out.println("Enter valid amount / option!");
        }
        return currentPin;
    }
}
