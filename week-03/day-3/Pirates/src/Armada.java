import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;

public class Armada {
    int numberOfShips;
    private Ship[] ships;

    public Ship[] initializeArmada() {
        numberOfShips = new Random().nextInt(50) + 15;
        ships = new Ship[numberOfShips];
        return ships;
    }

    public Ship[] fillArmada() {
        for (int i = 0; i < numberOfShips; i++) {
            ships[i] = new Ship();
            ships[i].fillShip();
        }
        return ships;
    }

    public Ship[] getArmada() {
        return ships;
    }

    public boolean war(Armada otherArmada) {
        for (int i = 0; i < numberOfShips; i++) {
            for (int j = 0; j < otherArmada.numberOfShips; j++) {
                if (!getArmada()[i].battle(otherArmada.getArmada()[j])) {
                    i++;
                    j--;
                }

            }
            return true;
        }
        return false;
    }

}




