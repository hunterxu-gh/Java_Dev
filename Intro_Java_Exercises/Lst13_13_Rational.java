/**
 * Lst13_13_Rational
 */
public class Lst13_13_Rational extends Number implements Comparable<Lst13_13_Rational> {
    private static long numerator;
    private static long denominator;
    
    public Lst13_13_Rational() {
        this.numerator = 0;
        this.denominator = 1;
        // this(0, 1);
    }

    public Lst13_13_Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerateor / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    public long gcd(long n, long d) {
        int n1 = Math.abs(n);
        int n2 = Math.abs(d);
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; i++)
            if (n1 % i == 0 && n2 % i ==0)
                gcd = i;
        
        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Lst13_13_Rational add(Lst13_13_Rational secondRational) {
        return secondRational;
    }

    @Override
    public String toString() {
        return denominator == 1 ? numerator / denominator : numerator;    
    }

    @Override
    public boolean equals(Object other) {
        if ()
    }
}