package task3;

// Принцип OCP

abstract class ExtendedCar extends Car {
    public ExtendedCar(String brand, String model, String color, String bodyType, int numberOfWheels,
                       String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, transmissionType, engineVolume);
    }

    public abstract void sweepStreet();

    public abstract void turnOnFogLights();

    public abstract void transportCargo();
}