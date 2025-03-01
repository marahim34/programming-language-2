package Problem4;

public class RollingDice2 {
    public static void main(String[] args) {
        PairOfDice dicePair = new PairOfDice();

        System.out.println("Initial: " + dicePair);

        dicePair.rollDice();
        System.out.println("After rolling: " + dicePair);

        dicePair.setDie1Value(6);
        System.out.println("After setting die1 to 6: " + dicePair);

        System.out.println("Sum of dice = " + dicePair.getSum());
    }
}
