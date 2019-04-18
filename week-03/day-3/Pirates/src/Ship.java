
import java.util.Arrays;
import java.util.Random;

public class Ship {
    private Pirate captain;
    private Pirate[] crew;

    public void fillShip() {
        captain = new Pirate();
        int number = new Random().nextInt(50) + 15;
        crew = new Pirate[number];

        int i = 0;
        while (i < number) {
            getCrew()[i] = new Pirate();
            i++;
        }
    }

    public int countAlive() {
        return (int) Arrays.stream(getCrew()).filter(x -> x.alive).count();
    }

    public boolean battle(Ship otherShip) {
        System.out.println("Ship 1: \n" + "Captain consumed " + this.getCaptain().getConsumedRum() + " units of rum;\n" +
                "Alive crew members: " + this.countAlive());
        System.out.println("Ship 2: \n" + "Captain consumed " + otherShip.getCaptain().getConsumedRum() + " units of rum;\n" +
                "Alive crew members: " + otherShip.countAlive());
        int thisScore = this.countAlive() - this.getCaptain().getConsumedRum();
        int otherScore = otherShip.countAlive() - otherShip.getCaptain().getConsumedRum();
        if (thisScore > otherScore) {
            this.party();
            killSomeCrew(otherShip);
            return true;
        } else {
            otherShip.party();
            killSomeCrew(this);
            return false;
        }
    }

    private static void killSomeCrew(Ship ship) {
        int deaths = new Random().nextInt(ship.countAlive() - 1) + 1;

        int index = 0;
        while (deaths > 0) {
            Pirate p = ship.getCrew()[index];
            if (p.alive) {
                p.die();
                deaths -= 1;
            }
            index += 1;
        }
    }


    public void party() {
        int unitsOfRum = new Random().nextInt(10) + 1;
        for (int i = 0; i < unitsOfRum; i++) {
            this.getCaptain().drinkSomeRum();
        }

        for (Pirate p : getCrew()) {
            for (int i = 0; i < unitsOfRum; i++) {
                p.drinkSomeRum();
            }
        }
    }

    public Pirate getCaptain() {
        return captain;
    }

    public Pirate[] getCrew() {
        return crew;
    }
}
