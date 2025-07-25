import java.util.*;
class BankAccount{
      private String accountHolder;
      private double balance;

    public void setAccountHolder(String name){
        if(name != null && !name.trim().isEmpty()){
            accountHolder = name;
        }
        else{
            System.out.println("Invalid name :");
        }
        
    }

    public void setBalance(double balance){
        if(balance > 0){
            this.balance = balance;
        }
        else{
            System.out.println("balance cann't be negative:");
        }
        
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    }

    public void getInfo(){
        System.out.println("Account name is:" + getAccountHolder() + "and balance is :" + getBalance());
    }
}

public class Bank_Account {
   public static void main(String[] args) {
    
    String naam;
    float balance;
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter Account holder name please:");
    naam = Sc.nextLine();
    System.out.println("Enter amount of account please:");
    balance = Sc.nextFloat();

    BankAccount a1 = new BankAccount();

    a1.setAccountHolder(naam);
    a1.setBalance(balance);
    a1.getInfo();

    Sc.close();
   }
}

