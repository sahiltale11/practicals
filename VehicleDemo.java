abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void accelerate();
}

interface GPSVehicle {
    void enableGPS();
    void disableGPS();
}

class Car extends Vehicle implements GPSVehicle {

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating smoothly");
    }

    @Override
    public void enableGPS() {
        System.out.println("GPS enabled in the car");
    }

    @Override
    public void disableGPS() {
        System.out.println("GPS disabled in the car.");
    }
}

class Bike extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Bike engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating ");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        
        Vehicle myCar = new Car();

        myCar.startEngine();
        myCar.accelerate();
        myCar.stopEngine();

        System.out.println();

        Vehicle myBike = new Bike();
        myBike.startEngine();
        myBike.accelerate();
        myBike.stopEngine();
    }
}
