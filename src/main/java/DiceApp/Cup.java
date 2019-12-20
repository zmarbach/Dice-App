package DiceApp;

public class Cup{
    Die die = new Die();

    public void turnOver(int numOfDie) {
        int sumOfDieRoll = 0;
        if (numOfDie > 0) {
            for (int i = 0; i < numOfDie; i++) {
                sumOfDieRoll  = sumOfDieRoll + die.roll();
            }
            System.out.println(sumOfDieRoll);
        }
    }
}
