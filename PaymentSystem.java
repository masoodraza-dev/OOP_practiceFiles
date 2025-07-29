/* 
Design a Payment System with the following:

There is a base class User (abstract) with name and email.
All users can display info, but each performs different payment actions.
There’s a Payable interface which requires makePayment(double amount) method.
Two types of users:
Customer
Merchant
Customer makes payment, Merchant receives it.
In main, create array of User, and call their methods via polymorphism.
*/

interface Payable {
    void makePayment(double amount);
}

abstract class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }

    abstract void performAction();
}

class Customer extends User implements Payable {
    Customer(String name, String email) {
        super(name, email);
    }

    public void makePayment(double amount) {
        System.out.println(name + " paid Rs." + amount + " to merchant.");
    }

    void performAction() {
        System.out.println(name + " is buying products.");
    }
}

class Merchant extends User implements Payable {
    Merchant(String name, String email) {
        super(name, email);
    }

    public void makePayment(double amount) {
        System.out.println(name + " received Rs." + amount + " from customer.");
    }

    void performAction() {
        System.out.println(name + " is selling products.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {

        User[] users = new User[4];
        users[0] = new Customer("Masood", "masoodr508@gmail.com");
        users[1] = new Merchant("Ali", "alishanbani0@gmail.com");
        users[2] = new Customer("Manahil", "manahil@gmail.com");
        users[3] = new Merchant("Hassan", "hassanabbasshanbani110@gmail.com");

        System.out.println("----- User Details & Actions -----");
        for (User user : users) {
            user.displayInfo();
            user.performAction();

            
            if (user instanceof Payable) {
                Payable p = (Payable) user;
                p.makePayment(500.0);
            }

            System.out.println("----------------------------------");
        }
    }
}
