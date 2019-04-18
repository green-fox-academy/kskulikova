public class WarApp {
    public static void main(String[] args) {


        Armada armada1 = new Armada();
        armada1.initializeArmada();
        armada1.fillArmada();

        Armada armada2 = new Armada();
        armada2.initializeArmada();
        armada2.fillArmada();


        System.out.println("********************************\n" +
                ((armada1.war(armada2) ? "******* OUR ARMADA WON!!!*******" : "****** OUR ARMADA LOST... ******"))
                + "\n********************************\n");

    }
}
