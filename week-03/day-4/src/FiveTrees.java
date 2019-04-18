import java.util.ArrayList;
import java.util.List;

class FiveTrees {
    private List<Tree> trees = new ArrayList<>();

    private void add(Tree tree) {
        trees.add(tree);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < trees.size(); i++) {
            result += (i + 1) + ". " + trees.get(i).toString() + "\n";
        }
        return result;
    }


    public static void main(String[] args) {
        FiveTrees forest = new FiveTrees();

        forest.add(new Tree("birch", "green", 7, 'F'));
        forest.add(new Tree("ash", "red", 19, 'F'));
        forest.add(new Tree("сedarwood", "green", 70, 'M'));
        forest.add(new Tree("acacia", "yellow", 23, 'M'));
        forest.add(new Tree());

        System.out.println(forest.toString());
    }


}





