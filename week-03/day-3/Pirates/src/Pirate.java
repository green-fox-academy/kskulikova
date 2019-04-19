public class Pirate {

    private boolean alive;
    private boolean passedOut;
    private int consumedRum;

    Pirate (){
        this.passedOut = false;
        this.consumedRum = 0;
        this.alive = true;
    }

    void drinkSomeRum() {
        if (!alive) {
            System.out.println("He's dead");
        } else {
            this.consumedRum++;
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

    void die() {
        this.alive = false;
    }

    public void brawl(Pirate otherPirate) {
        if (otherPirate.alive) {
            int chance = 0;
            chance = (int) (Math.random() * (3 + 1));
            if (chance == 1) {
                this.die();
            } else if (chance == 2) {
                otherPirate.die();
            } else{
                this.passedOut = true;
                otherPirate.passedOut = true;
            }

        }
    }

    int getConsumedRum() {
        return consumedRum;
    }

    public boolean isAlive() {
        return alive;
    }
}


