package task3;

// Принцип LSP

class ThreeWheeledCar extends Car {
    public ThreeWheeledCar(String brand, String model, String color, String bodyType, String fuelType,
                           String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, 3, fuelType, transmissionType, engineVolume);
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