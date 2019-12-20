package DiceApp;

import java.util.Random;

public class Die {
    private int resultOfRoll;
    private Random r = new Random();

    public int roll() {
        resultOfRoll = r.nextInt(6) + 1;
        return resultOfRoll;
    }
}
