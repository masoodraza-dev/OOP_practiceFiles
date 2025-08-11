public class Addition {

    public static void addition(FractionOps other1, FractionOps other2) {
        int numerator = (other1.numer * other2.denom) + (other1.denom * other2.numer);
        int denominator = other1.denom * other2.denom;
        System.out.println("\n ADDITION");
        FractionOps.simplify(numerator, denominator);
    }

}
