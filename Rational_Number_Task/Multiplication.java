public class Multiplication {
    public static void multiply(FractionOps other1, FractionOps other2) {
        int numerator = other1.numer * other2.numer;
        int denominator = other1.denom * other2.denom;
        System.out.println("\n MULTIPLICATION");
        FractionOps.simplify(numerator, denominator);
    }
}
