//Reuse your Sharpie class
//Create SharpieSet class
//it contains a list of Sharpie
//countUsable() -> sharpie is usable if it has ink in it
//removeTrash() -> removes all unusable sharpies

import java.util.ArrayList;

public class SharpieSet {

    ArrayList<Sharpie> sharpieSet = new ArrayList<>();

    public void add(Sharpie s) {
        sharpieSet.add(s);
    }

    public int countUsable() {
        int count = 0;
        for (Sharpie s : sharpieSet) {
            if (isUsable(s)) {
                count++;
            }
        }
        return count;
    }

    public boolean isUsable(Sharpie s) {
        return s.inkAmount > 0;

    }

    public void removeTrash() {
        ArrayList<Sharpie> clean = new ArrayList<>();
        for (Sharpie s : sharpieSet) {
            if (isUsable(s)) {
                clean.add(s);
            }
        }
        sharpieSet = clean;
    }


    public static void main(String[] args) {
        SharpieSet mySet = new SharpieSet();

        mySet.add(new Sharpie("red", 1.5f));
        mySet.add(new Sharpie("green", 2.9f));
        mySet.add(new Sharpie("orange", 0.9f));


        System.out.println(mySet.countUsable());

        for (int i = 0; i < 100; i++) {
            mySet.sharpieSet.get(2).use();
        }
        System.out.println(mySet.countUsable());

        mySet.removeTrash();
        System.out.println(mySet.sharpieSet.size());

    }
}


