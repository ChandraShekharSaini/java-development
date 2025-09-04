package Patterns.FactoryDesign;

public class MainClass {
    public static void main(String[] args) {



        Factory factory = new Factory();

//        Car car = (Car) factory.getVehicle("car") ;
//        car.start();

        Vehicle vehicle1 = factory.getVehicle("car");
        vehicle1.start();

        Vehicle vehicle2 = factory.getVehicle("bike");
        vehicle2.start();

    }
}
