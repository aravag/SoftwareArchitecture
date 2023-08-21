package task3;

// Принцип LSP

class FlyingCar extends Car {
    public FlyingCar(String brand, String model, String color, String bodyType, int numberOfWheels,
                     String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, transmissionType, engineVolume);
    }

    @Override
    public void move() {

    }

    @Override
    public void performMaintenance() {

    }

    @Override
    public void changeGear() {

    }

    @Override
    public void turnOnHeadlights() {

    }

    @Override
    public void turnOnWipers() {

    }
}