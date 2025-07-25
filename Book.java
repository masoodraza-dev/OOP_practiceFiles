import java.util.*;

class Bookone {
    private String title ;
    private double price;

    public void setTitle(String Title){
        if(Title != null && !Title.trim().isEmpty()){
        title = Title;
        }
        else{
            System.out.println("Invalid name:");
        }
    }

    public void setPrice(double Price){
        if(Price >= 0){
            price = Price;
        }
        else {
            System.out.println("Enter positive Price Please:");
        }
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    void getInfo(){

      System.out.println("Book title is " + getTitle() + ". Book price is " + getPrice());

    }
}

public class Book {
    public static void main(String[] args) {

        String naam;
        double price;

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter book Title");
        naam = Sc.nextLine();
        System.out.println("Enter price of your book:");
        price = Sc.nextDouble();

        Bookone b1 = new Bookone();
        b1.setTitle(naam);
        b1.setPrice(price);
        b1.getInfo();

        Sc.close();
    }
    
}
