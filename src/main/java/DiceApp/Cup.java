package DiceApp;

import java.util.Random;

public class Cup {
    private Random random = new Random();

    public void rollOneDie() {
        int resultOfRoll = random.nextInt(6) + 1;
        System.out.println("Rolling 1 die: " + resultOfRoll);
    }

    public void rollMultipleDice (Dice dice) {
        int sumOfRoll = 0;
        for (int i = 0; i < dice.getNumOfDice(); i++) {
            int resultOfRoll = random.nextInt(6) + 1;
            sumOfRoll = sumOfRoll += resultOfRoll;
        }
        System.out.println("Rolling " + dice.getNumOfDice() + " dice with a cup: " + sumOfRoll);
    }
    public void rollLoadedDie() {
        int randomNum = random.nextInt(100) + 1;
        int loadedNum = 2;
        if (randomNum <= 50) {
            System.out.println("Rolling a loaded die set to '" + loadedNum + "' : " + loadedNum);
        } else {
            int resultOfRoll = random.nextInt(6) + 1;
            System.out.println("Rolling a loaded die set to '" + loadedNum + "' : " + resultOfRoll);
        }
    }
}

