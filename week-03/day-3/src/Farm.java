//Reuse your Animal class
//Create a Farm class
//it has list of Animals
//it has slots which defines the number of free places for animals
//breed() -> creates a new animal if there's place for it
//slaughter() -> removes the least hungry animal

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animal> animals = new ArrayList<>();
    private int slots;

    public void breed() {
        if (slots > 0) {
            this.animals.add(new Animal());
            this.slots--;
        } else {
            System.out.println("no free slots!");
        }

    }

    public void slaughter() {
        int hungry = 50;
        for (Animal a : animals) {
            if (a.hunger < hungry) {
                hungry = a.hunger;
            }
        }

        Animal leastHungry = new Animal();
        for (Animal a : animals) {
            if (a.hunger == hungry) {
                leastHungry = a;
            }
        }
        animals.remove(leastHungry);
        this.slots++;
    }

    Farm(int slots) {
        this.slots = slots;
    }

    public void add(){
        this.animals.add(new Animal());
    }


    public static void main(String[] args) {
        Farm myFarm = new Farm(3);
        for (int i = 0; i < 5; i++){
            myFarm.add();
        }

        myFarm.animals.get(3).hunger = 7;
        myFarm.slaughter();

        System.out.println(myFarm.slots);
        System.out.println(myFarm.animals.size());

        myFarm.breed();
        System.out.println(myFarm.slots);
        myFarm.breed();
        myFarm.breed();
        myFarm.breed();
        myFarm.breed();

    }

}


