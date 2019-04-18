public class WarApp {
    public static void main(String[] args) {


        Armada armada1 = new Armada();
        armada1.initializeArmada();
        armada1.fillArmada();

        Armada armada2 = new Armada();
        armada2.initializeArmada();
        armada2.fillArmada();


        System.out.println("-------------------\n" + "-------------------\n" + "Our armada" + (armada1.war(armada2) ? " WON!!!" : " LOST..."));
        
    }
}
