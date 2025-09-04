package Patterns.FactoryDesign;

public class Factory {
    public static Vehicle getVehicle(String type){

        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }

        return null;
    }

}
