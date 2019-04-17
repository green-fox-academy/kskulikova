public class Pirate {

    int intoxicated;
    boolean alive;
    boolean passedOut;
    int consumedRum;

    Pirate (){
        this.passedOut = false;
        this.consumedRum = 0;
        this.intoxicated = 10;
        this.alive = true;
    }

    public void drinkSomeRum() {
        if (!alive) {
            System.out.println("He's dead");
        } else {
            this.intoxicated += 2;
            this.consumedRum ++;
        }
    }

    public void howsItGoingMate() {
        if (!alive) {
            System.out.println("He's dead");
        } else if (this.consumedRum < 5) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.passedOut = true;
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
}


