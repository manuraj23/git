package src;
import java.util.Scanner;

public class CreateAccount {
    public static void createNewAccount() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- ACCOUNT CREATION FORM ---");
        
        // 1. Collect Full Name
        System.out.print("Enter your Full Name: ");
        String name = sc.nextLine();
        
        // 2. Collect Age with validation
        System.out.print("Enter your Age: ");
        int age = 0;
        if (sc.hasNextInt()) {
            age = sc.nextInt();
            sc.nextLine(); // Clear the scanner buffer line after reading the integer
        } else {
            System.out.println("Enter valid amount / option!"); // Matches your main menu error style
            sc.nextLine(); // Clear the scanner buffer line
        }
        
        // 3. Collect Date of Birth
        System.out.print("Enter your Date of Birth (DD/MM/YYYY): ");
        String dob = sc.nextLine();
        
        // 4. Confirmation Output
        System.out.println("\n=== Account Profile Created ===");
        System.out.println("Holder Name : " + name);
        System.out.println("Age         : " + age + " years");
        System.out.println("DOB         : " + dob);
        System.out.println("===============================");
    }
}
