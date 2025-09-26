import java.util.Scanner;

public class Customer {
    private int wallet;
    private Scanner scanner;
    
    // Constructor
    public Customer() {
        this.scanner = new Scanner(System.in);
        setupCustomer();
    }
    
    // Method to setup customer with user input
    private void setupCustomer() {
        System.out.println("=== Customer Setup ===");
        System.out.print("Enter initial wallet amount: Rs. ");
        this.wallet = scanner.nextInt();
        System.out.println("Customer setup completed! Wallet balance: Rs. " + wallet + "\n");
    }
    
    // Method to pay bill with user interaction
    public void payBill(Cashier cashier) {
        System.out.println("\n=== Customer Payment ===");
        System.out.println("Current wallet balance: Rs. " + wallet);
        cashier.showBill();
        
        System.out.print("Enter amount to pay: Rs. ");
        int amountToPay = scanner.nextInt();
        
        if (amountToPay > wallet) {
            System.out.println("❌ Insufficient funds in wallet!");
            System.out.println("You have: Rs. " + wallet + ", but trying to pay: Rs. " + amountToPay);
            return;
        }
        
        if (amountToPay < cashier.getBill()) {
            System.out.println("❌ Amount paid is less than the bill!");
            System.out.println("Bill: Rs. " + cashier.getBill() + ", Paid: Rs. " + amountToPay);
            return;
        }
        
        // Process payment
        wallet -= amountToPay;
        System.out.println("✅ Payment successful! Paid: Rs. " + amountToPay);
        System.out.println("Wallet after payment: Rs. " + wallet);
        
        // Process change
        int change = amountToPay - cashier.getBill();
        if (change > 0) {
            System.out.println("Change received: Rs. " + change);
            wallet += change;
            System.out.println("✅ Change added to wallet. New balance: Rs. " + wallet);
        }
    }
    
    // Add money to wallet
    public void addMoneyToWallet() {
        System.out.print("Enter amount to add to wallet: Rs. ");
        int amount = scanner.nextInt();
        wallet += amount;
        System.out.println("✅ Money added! New wallet balance: Rs. " + wallet);
    }
    
    // toString method
    @Override
    public String toString() {
        return "Customer [Wallet Balance: Rs. " + wallet + "]";
    }
    
    // Getter
    public int getWallet() {
        return wallet;
    }
    
    // Close scanner
    public void closeScanner() {
        scanner.close();
    }
}