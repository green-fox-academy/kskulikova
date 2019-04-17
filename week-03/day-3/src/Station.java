//Create Station and Car classes
//Station
//gasAmount
//refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount

public class Station {
    private int gasAmount;

    Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    private void refill(Car car) {
        gasAmount -= car.capacity;
        car.gasAmount += car.capacity;
    }

    public static void main(String[] args) {
        Car superCar = new Car();
        Station theBestStation = new Station(500);

        System.out.println(theBestStation.gasAmount);
        System.out.println(superCar.gasAmount);
        System.out.println(superCar.capacity);

        theBestStation.refill(superCar);

        System.out.println(theBestStation.gasAmount);
        System.out.println(superCar.gasAmount);
    }

}
