package Problem4;

public class PairOfDice {
    private Die die1;
    private Die die2;

    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();
    }

    public void rollDice() {
        die1.roll();
        die2.roll();
    }

    public int getDie1Value() {
        return die1.getValue();
    }

    public int getDie2Value() {
        return die2.getValue();
    }

    public void setDie1Value(int value) {
        die1.setValue(value);
    }

    public void setDie2Value(int value) {
        die2.setValue(value);
    }

    public int getSum() {
        return die1.getValue() + die2.getValue();
    }

    @Override
    public String toString() {
        return "PairOfDice [die1=" + die1.getValue() +
                ", die2=" + die2.getValue() +
                ", sum=" + getSum() + "]";
    }
}
