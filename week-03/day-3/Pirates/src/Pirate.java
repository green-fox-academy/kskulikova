public class Pirate {

    boolean alive;
    private boolean passedOut;
    private int consumedRum;

    Pirate (){
        this.passedOut = false;
        this.consumedRum = 0;
        this.alive = true;
    }

    public void drinkSomeRum() {
        if (!alive) {
            System.out.println("He's dead");
        } else {
            this.consumedRum = this.getConsumedRum() + 1;
        }
    }

    public void howsItGoingMate() {
        if (!alive) {
            System.out.println("He's dead");
        } else if (this.getConsumedRum() < 5) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.passedOut = true;
            this.consumedRum = 0;
        }
    }

    public void die() {
        this.alive = false;
    }

    public void brawl(Pirate otherPirate) {
        if (otherPirate.alive) {
            int chance = 0;
            chance = (int) (Math.random() * (3 + 1));
            if (chance == 1) {
                this.alive = false;
            } else if (chance == 2) {
                otherPirate.alive = false;
            } else{
                this.passedOut = true;
                otherPirate.passedOut = true;
            }

        }
    }

//    public void drink(int rum) {
//        if (rum > 0) {
//            consumedRum += rum;
//        }
//    }

    public int getConsumedRum() {
        return consumedRum;
    }
}


