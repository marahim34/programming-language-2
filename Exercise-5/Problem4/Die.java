package Problem4;

import java.util.Random;

public class Die {
    private int value;

    public Die(){
        value = 1;
    }

    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(6) + 1;  // 1 through 6
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Die: " + value;
    }
}
