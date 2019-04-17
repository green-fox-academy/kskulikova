//Create an Animal class
//Every animal has a hunger value, which is a whole number
//Every animal has a thirst value, which is a whole number
//when creating a new animal object these values are created with the default 50 value
//Every animal can eat() which decreases their hunger by one
//Every animal can drink() which decreases their thirst by one
//Every animal can play() which increases both by one

public class Animal {
    private int thirst;
    private int hunger;

    public Animal() {
        this(50, 50);
    }

    private Animal(int thirst, int hunger) {
        this.thirst = thirst;
        this.hunger = hunger;
    }

    private void eat() {
        this.hunger--;
    }

    private void drink() {
        this.thirst--;
    }

    private void play() {
        this.thirst++;
        this.hunger++;
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal(100, 100);

        cat.eat();
        dog.drink();
        dog.play();
        cat.eat();
    }
}