import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numerator of first fraction: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter denominator of first fraction: ");
        int den1 = scanner.nextInt();

        System.out.println("Enter numerator of second fraction: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter denominator of second fraction: ");
        int den2 = scanner.nextInt();

        FractionOps opr1 = new FractionOps(num1, den1);
        FractionOps opr2 = new FractionOps(num2, den2);

        Addition.addition(opr1, opr2);
        Subtract.subtract(opr1, opr2);
        Multiplication.multiply(opr1, opr2);
        Division.divide(opr1, opr2);

        System.out.println(opr1.numer);
        System.out.println(opr1.denom);
    }

}
