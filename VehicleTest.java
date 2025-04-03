abstract class Vehicle {                                                      // Abstract class Vehicle

    abstract void startEngine();
    abstract void stopEngine();
    abstract void accelerate();
}

interface GPSVehicle {            // GPSVehicle Interface
    void enableGPS();
    void disableGPS();
}


class Car extends Vehicle implements GPSVehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    @Override
    void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void enableGPS() {
        System.out.println("GPS enabled in the car.");
    }

    @Override
    public void disableGPS() {
        System.out.println("GPS disabled in the car.");
    }
}


class Bike extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Bike engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Bike engine stopped.");
    }

    @Override
    void accelerate() {
        System.out.println("Bike is accelerating.");
    }
}


public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.enableGPS();
        myCar.stopEngine();

        System.out.println();

        Bike myBike = new Bike();
        myBike.startEngine();
        myBike.accelerate();
        myBike.stopEngine();
    }
}
