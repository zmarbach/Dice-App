package DiceApp;

import java.util.Random;

public class LoadedDie extends Die {
    private Random r = new Random();
    private int loadedNum = 3;

    @Override
    public int roll() {
        int randomNum = r.nextInt(2) + 1;
        if (randomNum == 1) {
            System.out.println(loadedNum);
            return loadedNum;
        } else {
            var resultOfRoll = r.nextInt(6) + 1;
            System.out.println(resultOfRoll);
            return resultOfRoll;
        }


    }
}
