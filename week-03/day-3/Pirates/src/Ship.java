
import java.util.Arrays;
import java.util.Random;

public class Ship {
    Pirate capitain;
    Pirate crew[];
    int score;

    public void fillShip() {
        capitain = new Pirate();
        int number = (int) (new Random().nextInt(50) + 15);
        crew = new Pirate[number];

        int i = 0;
        while (i < number) {
            crew[i] = new Pirate();
            i++;
        }
    }

    public int countAlive() {
        int alive = 0;
        for (Pirate p : crew) {
            if (p.alive) {
                alive++;
            }
        }
        return alive;
    }

    public boolean battle(Ship otherShip) {
        System.out.println("Ship 1: \n" + "Captain consumed " + this.capitain.consumedRum + " units of rum;\n" +
                "Alive crew members: " + this.countAlive());
        System.out.println("Ship 2: \n" + "Captain consumed " + otherShip.capitain.consumedRum + " units of rum;\n" +
                "Alive crew members: " + otherShip.countAlive());
        int thisScore = this.countAlive() - this.capitain.consumedRum;
        int otherScore = otherShip.countAlive() - otherShip.capitain.consumedRum;
        if (thisScore > otherScore) {
            party();
            return true;
        } else {
            int deaths = (int) (new Random().nextInt(otherShip.crew.length - 1) + 1);
            otherShip.crew = Arrays.copyOfRange(otherShip.crew, 0, otherShip.crew.length - deaths);
            return false;
        }
    }


    public void party() {
        int unitsOfRum = (int) (new Random().nextInt(10) + 1);
        this.capitain.consumedRum += unitsOfRum;
        for (Pirate p : crew) {
            p.consumedRum += unitsOfRum;
        }
    }
}
