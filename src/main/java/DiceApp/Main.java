package DiceApp;

public class Main {

    public static void main(String[] args) {
        Die die = new Die();
        LoadedDie loadedDie = new LoadedDie();
        Cup cup = new Cup();

        //boolean loop = true;
        //while (loop) {
            var result = die.roll();
            System.out.println(result);
            cup.turnOver(0);
            cup.turnOver(6);
            cup.turnOver(12);
            cup.turnOver(120);
            cup.turnOver(4567);
            cup.turnOver(1000000000);
            loadedDie.roll();
            loadedDie.roll();


        //System.out.println("How many dice do you want to roll?");
        //how many regulare dice do you want to roll? how many loaded dice?

    }
}
