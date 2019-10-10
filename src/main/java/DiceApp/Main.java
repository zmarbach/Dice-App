package DiceApp;

public class Main {

    public static void main(String[] args) {
        Cup cup = new Cup();
        cup.rollOneDie();
        cup.rollMultipleDice(new Dice(2));
        cup.rollMultipleDice(new Dice(6));
        cup.rollMultipleDice(new Dice(12));
        cup.rollMultipleDice(new Dice(120));
        cup.rollLoadedDie();
        cup.rollLoadedDie();
        }
    }
