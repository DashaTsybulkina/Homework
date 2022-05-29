package transport;

public abstract class GroundTransport extends Transport {
    private int countWheels;
    private double fuelRate;

    public GroundTransport(int power, int maxSpeed, int weight, String brand, int countWheels, double fuelRate) {
        super(power, maxSpeed, weight, brand);
        this.countWheels = countWheels;
        this.fuelRate = fuelRate;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public double getFuelRate() {
        return fuelRate;
    }
}
