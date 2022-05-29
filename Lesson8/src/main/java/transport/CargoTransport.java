package transport;

public class CargoTransport extends GroundTransport {
    private int loadCapacity;

    public CargoTransport(int power, int maxSpeed, int weight, String brand, int countWheels, double fuelRate, int loadCapacity) {
        super(power, maxSpeed, weight, brand, countWheels, fuelRate);
        this.loadCapacity = loadCapacity;
    }

    public void checkCapacity(int weight) {
        if (weight <= loadCapacity) {
            System.out.println("Truck is loaded");
        } else {
            System.out.println("Need a bigger truck");
        }
    }

    public String info() {
        return "CargoTransport: " +
                "loadCapacity=" + loadCapacity +
                ", countWheels=" + super.getCountWheels() +
                ", fuelRate=" + super.getFuelRate() +
                ", power= " + super.getPower() +
                "(hp), or " + super.getPower() * 0.74 +
                "(kW), maxSpeed=" + super.getMaxSpeed() +
                ", weight=" + super.getWeight() +
                ", brand=" + super.getBrand();
    }
}
