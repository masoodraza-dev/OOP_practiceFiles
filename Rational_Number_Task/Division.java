public class Division {
    public static void divide(FractionOps other1, FractionOps other2) {
        int numerator = (other1.numer * other2.denom);
        int denominator = other1.denom * other2.numer;
        System.out.println("\n DIVISION");
        FractionOps.simplify(numerator, denominator);
    }
}
