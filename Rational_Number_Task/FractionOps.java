public class FractionOps {
    int denom;
    int numer;

    FractionOps(int num, int den) {
        this.numer = num;
        this.denom = den;
    }

    public static void simplify(int num, int den) {
        int numCopy = num;
        int denCopy = den;

        while (den != 0) {
            int temp = den;
            den = num % den;
            num = temp;
        }

        int gcd = num; // greatest common divisor

        // Reduce the fraction
        numCopy /= gcd;
        denCopy /= gcd;

        System.out.println(numCopy + "/" + denCopy);
    }

    public void setNumerator(int num) {
        this.numer = num;
    }

    public void setDenominator(int den) {
        this.denom = den;
    }

    public int getNumerator() {
        return numer;
    }

    public int getDenominator() {
        return denom;
    }

    @Override
    public String toString() {
        return (numer + "/" + denom);
    }
}
