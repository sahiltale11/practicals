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
   
    void startEngine() {
        System.out.println("Car engine started.");
    }

    void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    void accelerate() {
        System.out.println("Car is accelerating.");
    }

    public void enableGPS() {
        System.out.println("GPS enabled in the car.");
    }

    public void disableGPS() {
        System.out.println("GPS disabled in the car.");
    }
}


class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike engine started.");
    }

    void stopEngine() {
        System.out.println("Bike engine stopped.");
    }

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
