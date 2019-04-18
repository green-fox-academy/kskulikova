import java.util.Random;

class Armada {
    private int numberOfShips;
    private Ship[] ships;

    void initializeArmada() {
        numberOfShips = new Random().nextInt(20) + 15;
        ships = new Ship[numberOfShips];
    }

    void fillArmada() {
        for (int i = 0; i < numberOfShips; i++) {
            ships[i] = new Ship();
            ships[i].fillShip();
        }
    }

    private Ship[] getArmada() {
        return ships;
    }


    boolean war(Armada otherArmada) {
        int ourShipsCounter = 0;

        for (int enemyShipsCounter = 0; enemyShipsCounter < otherArmada.numberOfShips; enemyShipsCounter++) {
            if (ourShipsCounter >= numberOfShips) {
                return false;
            } else {
                if (!getArmada()[ourShipsCounter].battle(otherArmada.getArmada()[enemyShipsCounter])) {
                    ourShipsCounter++;
                    enemyShipsCounter--;
                }
            }
        }
        return true;

    }

}




