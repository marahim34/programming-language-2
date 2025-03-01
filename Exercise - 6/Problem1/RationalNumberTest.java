public class RationalNumberTest {
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(1, 2);
        RationalNumber r2 = new RationalNumber(2, 4);
        RationalNumber r3 = new RationalNumber(3, 4);
        RationalNumber r4 = new RationalNumber(5, 10);

        System.out.println("r1: " + r1 + " vs r2: " + r2
                + " => compareTo = " + r1.compareTo(r2));

        System.out.println("r1: " + r1 + " vs r3: " + r3
                + " => compareTo = " + r1.compareTo(r3));

        System.out.println("r3: " + r3 + " vs r2: " + r2
                + " => compareTo = " + r3.compareTo(r2));

        System.out.println("r1: " + r1 + " vs r4: " + r4
                + " => compareTo = " + r1.compareTo(r4));
    }
}

