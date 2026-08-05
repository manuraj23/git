package src;
import java.util.Scanner;

public class PasswordManager {
    // Ye method purana password check karke naya password return karega
    public static String updatePassword(String currentPassword) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your current Password: ");
        String currentInput = sc.nextLine();

        // Password matching check
        if (currentInput.equals(currentPassword)) {
            System.out.print("Enter your NEW Password: ");
            String newPassword = sc.nextLine();
            
            System.out.print("Confirm your NEW Password: ");
            String confirmPassword = sc.nextLine();

            if (newPassword.equals(confirmPassword)) {
                System.out.println("Success: Your password has been changed successfully!");
                return newPassword; // Naya password main program ko bhej diya
            } else {
                System.out.println("Error: New passwords do not match! Try again.");
            }
        } else {
            System.out.println("Error: Incorrect current password! Authorization failed.");
        }
        
        return currentPassword; // Agar kuch galat hua to purana password hi rahega
    }
}
