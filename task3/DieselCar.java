package task3;

class DieselCar extends ConcreteCar {
    public DieselCar(String brand, String model, String color, String bodyType, int numberOfWheels,
                     String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, "Diesel", transmissionType, engineVolume);
    }
}