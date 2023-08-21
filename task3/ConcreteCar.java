package task3;

class ConcreteCar extends ExtendedCar implements FuelStation, CarMaintenance {
    public ConcreteCar(String brand, String model, String color, String bodyType, int numberOfWheels,
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

    @Override
    public void sweepStreet() {
        
    }

    @Override
    public void turnOnFogLights() {
        
    }

    @Override
    public void transportCargo() {
        
    }

    @Override
    public void refuel() {
        
    }

    @Override
    public void wipeWindshield() {
        
    }

    @Override
    public void wipeHeadlights() {
        
    }

    @Override
    public void wipeMirrors() {
        
    }
}