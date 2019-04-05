public class JosephusProblem {
    public static void main(String[] args) {
        josephus(12);
    }

    static void josephus(int i) {


    // if n = 2^m + l, f(n) = 2l + 1
    // l = n - 2^m
        int power = 0;
        int j = i;
        while (j > 1){
            j /= 2;
            power++;
        }
        double l = i - Math.pow(2, power);
        System.out.println(2 * (int)l + 1);
    }
}


