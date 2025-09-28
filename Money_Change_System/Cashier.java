import java.util.Arrays;
import java.util.Scanner;

public class Cashier {
    private int bill;
    private int[] denominations = {1,2,5,10,20,50,100,500,1000,5000};
    private int[] returnMoney;
    private Scanner scanner;
    
    // Constructor
    public Cashier() {
        this.scanner = new Scanner(System.in);
        this.returnMoney = new int[0];
        setupCashier();
    }
    
    // Method to setup cashier with user input
    private void setupCashier() {
        System.out.println("=== Cashier Setup ===");
        
        // Bill amount input from user
        System.out.print("Enter total bill amount: Rs. ");
        this.bill = scanner.nextInt();
        
        // Denominations input from user
        int numDenominations = 10;
        this.returnMoney = new int[numDenominations];
        
        // System.out.println("Enter denominations (from smallest to largest):");
        // for (int i = 0; i < numDenominations; i++) {
        //     System.out.print("Denomination " + (i + 1) + ": Rs. ");
        //     denominations[i] = scanner.nextInt();
        // }
        
        Arrays.sort(denominations); // Sort denominations
        System.out.println("Cashier setup completed!\n");
    }
    
    // Method to show bill
    public void showBill() {
        System.out.println("Total Bill: Rs. " + bill);
    }
    
    // Method to get payment from user and calculate change
    public void processPayment() {
        System.out.println("\n=== Payment Processing ===");
        showBill();
        
        System.out.print("Enter amount paid by customer: Rs. ");
        int amountPaid = scanner.nextInt();
        
        if (amountPaid < bill) {
            System.out.println("Insufficient amount paid! Please pay full amount.");
            return;
        }
        
        int change = amountPaid - bill;
        System.out.println("Change to return: Rs. " + change);
        
        calculateChange(change);
        displayReturnedMoney();
    }
    
    // Calculate change using largest denominations first
    private void calculateChange(int change) {
        // Reset returnMoney array
        Arrays.fill(returnMoney, 0);
        
        int remainingChange = change;
        
        // Start from largest denomination
        for (int i = denominations.length - 1; i >= 0; i--) {
            if (remainingChange >= denominations[i]) {
                returnMoney[i] = remainingChange / denominations[i];
                remainingChange %= denominations[i];
            }
        }
        
        if (remainingChange > 0) {
            System.out.println("Note: Rs. " + remainingChange + " cannot be returned with available denominations.");
        }
    }
    
    // Display the returned money breakdown
    public void displayReturnedMoney() {
        System.out.println("\n=== Returned Money Breakdown ===");
        boolean moneyReturned = false;
        int totalReturned = 0;
        
        for (int i = denominations.length - 1; i >= 0; i--) {
            if (returnMoney[i] > 0) {
                System.out.println("Rs. " + denominations[i] + " notes: " + returnMoney[i]);
                totalReturned += returnMoney[i] * denominations[i];
                moneyReturned = true;
            }
        }
        
        if (!moneyReturned) {
            System.out.println("No money to return.");
        } else {
            System.out.println("Total returned: Rs. " + totalReturned);
        }
    }
    
    // toString method
    @Override
    public String toString() {
        return "Cashier [Bill: Rs. " + bill + ", Denominations: " + Arrays.toString(denominations) + "]";
    }
    
    // Get user input for new bill
    public void enterNewBill() {
        System.out.print("\nEnter new bill amount: Rs. ");
        this.bill = scanner.nextInt();
        System.out.println("New bill amount set to: Rs. " + bill);
    }
    
    // Close scanner
    public void closeScanner() {
        scanner.close();
    }
    
    // Getters
    public int getBill() {
        return bill;
    }
    
    public int[] getDenominations() {
        return denominations.clone();
    }
    
    public int[] getReturnMoney() {
        return returnMoney.clone();
    }

}


