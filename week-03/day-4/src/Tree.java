
public class Tree {
    String type;
    String leafColor;
    int age;
    char sex;

    Tree(String type, String leafColor, int age, char sex) {
        this.type = type;
        this.leafColor = leafColor;
        this.age = age;
        this.sex = sex;
    }

    Tree() {
        type = "oak";
        this.leafColor = "red";
        this.age = 50;
        this.sex = 'M';
    }

    @Override
    public String toString() {
        return type + ", " + leafColor + ", " + age + " y.o., " + sex;
    }
}

