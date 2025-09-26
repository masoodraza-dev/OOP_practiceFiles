import java.util.Scanner;

public class StoreSystem {
    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        
        System.out.println("🛍️  Welcome to Store Billing System 🛍️");
        System.out.println("=====================================");
        
        // Create cashier with user input
        Cashier cashier = new Cashier();
        
        // Create customer with user input
        Customer customer = new Customer();
        
        boolean running = true;
        
        while (running) {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. Show Bill");
            System.out.println("2. Process Payment");
            System.out.println("3. Show Customer Wallet");
            System.out.println("4. Add Money to Wallet");
            System.out.println("5. Enter New Bill");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            
            int choice = mainScanner.nextInt();
            
            switch (choice) {
                case 1:
                    cashier.showBill();
                    break;
                    
                case 2:
                    customer.payBill(cashier);
                    break;
                    
                case 3:
                    System.out.println(customer);
                    break;
                    
                case 4:
                    customer.addMoneyToWallet();
                    break;
                    
                case 5:
                    cashier.enterNewBill();
                    break;
                    
                case 6:
                    running = false;
                    System.out.println("Thank you for using Store Billing System!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        
        mainScanner.close();
    }
}