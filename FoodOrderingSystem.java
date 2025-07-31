//Details about question and tasks were performed in this code are give in FoodOrderingSystem.txt in same folder.

import java.util.*;

abstract class FoodItem {
    String name;
    double price;

    FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract void prepare();

    public void displayInfo() {
        System.out.println(name + " - Rs. " + price);
    }
}

interface Discountable {
    void applyDiscount(double percentage);
}

class Pizza extends FoodItem implements Discountable {
    String type;

    Pizza(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    void prepare() {
        System.out.println("Preparing Pizza: " + name + " (" + type + ")");
    }

    @Override
    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }
}

class Burger extends FoodItem implements Discountable {
    boolean withCheese;

    Burger(String name, double price, boolean withCheese) {
        super(name, price);
        this.withCheese = withCheese;
    }

    @Override
    void prepare() {
        System.out.println("Preparing Burger: " + name + (withCheese ? " with Cheese" : ""));
    }

    @Override
    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }
}

class Drink extends FoodItem implements Discountable {
    boolean isCold;

    Drink(String name, double price, boolean isCold) {
        super(name, price);
        this.isCold = isCold;
    }

    @Override
    void prepare() {
        System.out.println("Preparing Drink: " + name + (isCold ? " (Cold)" : " (Hot)"));
    }

    @Override
    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }
}

class Customer {
    String name;
    String phoneNumber;

    Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    void placeOrder(Restaurant restaurant, List<FoodItem> items) {
        System.out.println("Order placed by: " + name);
        for (FoodItem item : items) {
            item.prepare();
            restaurant.addOrder(item);
        }
    }
}

class Restaurant {
    List<FoodItem> orders = new ArrayList<>();

    void addOrder(FoodItem item) {
        orders.add(item);
    }

    void showBill() {
        double total = 0;
        for (FoodItem item : orders) {
            item.displayInfo();
            total += item.price;
        }
        System.out.println("Total Bill: Rs. " + total);
    }
}

public class FoodOrderingSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("Masood Raza", "0300-1234567");

        FoodItem pizza = new Pizza("Margherita", 1300, "Veg");
        FoodItem burger = new Burger("Zinger", 600, true);
        FoodItem drink = new Drink("Pepsi", 100, true);

        ((Discountable) pizza).applyDiscount(10); 
        ((Discountable) burger).applyDiscount(10);
        ((Discountable) drink).applyDiscount(10);

        List<FoodItem> items = new ArrayList<>();
        items.add(pizza);
        items.add(burger);
        items.add(drink);

        Restaurant restaurant = new Restaurant();
        customer.placeOrder(restaurant, items);

        System.out.println("\n----- Bill -----");
        restaurant.showBill();
    }
}
