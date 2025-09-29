import java.util.Arrays;
import java.util.Scanner;

public class Cashier {
    private int bill = 0;
    private int[] denominations = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1}; 
    private int[] returnMoney;  
    Scanner scanner = new Scanner(System.in);

    // Method to show bill
    public void showBill() {
        int soap = 100;
        int shampoo = 200;
        int hairOil = 210;
        int bodySpray = 870;
        System.out.println("Purchased items:");
        System.out.println("Soap Rs. " + soap  
                         + "\nShampoo Rs. " + shampoo  
                         + "\nBody Spray Rs. " + bodySpray  
                         + "\nHair Oil Rs. " + hairOil);
        this.bill = soap + shampoo + hairOil + bodySpray;
        System.out.println("Total Bill: Rs. " + this.bill);
    }


    // Calculate change using largest denominations first
    public void calculateChange(int change) {
        returnMoney = new int[denominations.length]; // initialize

        for (int i = 0; i < denominations.length; i++) {
            if (change >= denominations[i]) {
                returnMoney[i] = change / denominations[i];
                change = change % denominations[i];
            }
        }
    }

    // Display the returned money breakdown
    public void displayReturnedMoney() {
        System.out.println("\n=== Returned Money Breakdown ===");
        boolean moneyReturned = false;
        int totalReturned = 0;

        for (int i = 0; i < denominations.length; i++) {
            if (returnMoney[i] > 0) {
                System.out.println("Rs. " + denominations[i] + " x " + returnMoney[i]);
                totalReturned += returnMoney[i] * denominations[i];
                moneyReturned = true;
            }
        }

        if (!moneyReturned) {
            System.out.println("No money to return.");
        } else {
            System.out.println("Total returned: Rs. " + totalReturned);
        }
        System.out.println("THANK YOU FOR SHOPPING\nPLEASE COME AGAIN");
    }

    // toString method
    @Override
    public String toString() {
        return "Cashier [Bill: Rs. " + bill 
             + ", Denominations: " + Arrays.toString(denominations) + "]";
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
