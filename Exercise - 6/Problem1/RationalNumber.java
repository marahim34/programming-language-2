public class RationalNumber implements Comparable <RationalNumber> {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is zero");
        }
        this.numerator = numerator;
        this.denominator =  denominator;
    }


    private void reduce() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        if(denominator < 0) {
            denominator = -denominator;
            numerator = -numerator;
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public int compareTo(RationalNumber other) {
        double tolerance = 0.0001;

        double thisValue = (double) this.numerator / this.denominator;
        double otherValue = (double) other.numerator / other.denominator;

        double diff = thisValue - otherValue;

        if(Math.abs(diff) < tolerance) {
            return 0;
        }
        else if(Math.abs(diff) > tolerance) {
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
