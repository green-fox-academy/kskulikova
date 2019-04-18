
import java.util.Arrays;
import java.util.Random;

class Ship {
    private Pirate captain;
    private Pirate[] crew;

    void fillShip() {
        captain = new Pirate();
        int number = new Random().nextInt(50) + 15;
        crew = new Pirate[number];

        int counter = 0;
        while (counter < number) {
            getCrew()[counter] = new Pirate();
            counter++;
        }
    }

    private int countAlive() {
        return (int) Arrays.stream(getCrew()).filter(x -> x.alive).count();
    }

    boolean battle(Ship otherShip) {
        System.out.println("OUR SHIP: \n" + "Captain consumed " + this.getCaptain().getConsumedRum() + " units of rum;\n" +
                "Alive crew members: " + this.countAlive() + "\n---------------------------------\n");
        System.out.println("ENEMY SHIP: \n" + "Captain consumed " + otherShip.getCaptain().getConsumedRum() + " units of rum;\n" +
                "Alive crew members: " + otherShip.countAlive() + "\n---------------------------------\n");
        int thisScore = this.countAlive() - this.getCaptain().getConsumedRum();
        int otherScore = otherShip.countAlive() - otherShip.getCaptain().getConsumedRum();
        if (thisScore > otherScore) {
            this.party();
            killSomeCrew(otherShip);
            System.out.println("Our ship WON!!!\n");
            return true;
        } else {
            otherShip.party();
            killSomeCrew(this);
            System.out.println("Our ship LOST!!!\n");
            return false;
        }
    }

    private static void killSomeCrew(Ship ship) {
        int deaths = new Random().nextInt(ship.countAlive() - 1) + 1;

        int index = 1;
        while (deaths > 1) {
            Pirate p = ship.getCrew()[index];
            if (p.alive) {
                p.die();
                deaths -= 1;
            }
            index += 1;
        }
    }

    private void party() {
        int unitsOfRum = new Random().nextInt(10) + 1;
        for (int i = 0; i < unitsOfRum; i++) {
            if (this.getCaptain().alive) {
                this.getCaptain().drinkSomeRum();
            } else {
                System.out.println("The captain is dead!");
            }
        }

        for (Pirate p : getCrew()) {
            for (int i = 0; i < unitsOfRum; i++) {
                if (p.alive) {
                    p.drinkSomeRum();
                }
            }
        }
    }

    private Pirate getCaptain() {
        return captain;
    }

    private Pirate[] getCrew() {
        return crew;
    }
}
