package task3;

class GasolineCar extends ConcreteCar {
    public GasolineCar(String brand, String model, String color, String bodyType, int numberOfWheels,
                       String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, "Gasoline", transmissionType, engineVolume);
    }
}