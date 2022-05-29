package transport;

public class PassengerTransport extends GroundTransport {
    private String typeOfBody;
    private int countOfPassenger;

    public PassengerTransport(int power, int maxSpeed, int weight, String brand, int countWheels, double fuelRate, String typeOfBody, int countOfPassenger) {
        super(power, maxSpeed, weight, brand, countWheels, fuelRate);
        this.typeOfBody = typeOfBody;
        this.countOfPassenger = countOfPassenger;
    }

    private double calculateFuel(double distance) {
        return super.getFuelRate() * distance / 100;
    }

    public void calculateDistance(double time) {
        double distance = super.getMaxSpeed() * time;
        System.out.println("Within " + Double.toString(time) + " hours car " +
                super.getBrand() + " moving at maximum speed " + Integer.toString(super.getMaxSpeed()) +
                "km/h will pass " + Double.toString(distance) + " km and will use up " + Double.toString(calculateFuel(distance)) +
                "l fuel");
    }

    public String info() {
        return "PassengerTransport:" +
                "typeOfBody='" + typeOfBody +
                ", countOfPassenger=" + countOfPassenger +
                ", countWheels=" + super.getCountWheels() +
                ", fuelRate=" + super.getFuelRate() +
                ", power= " + super.getPower() +
                "(hp), or " + super.getPower() * 0.74 +
                "(kW), maxSpeed=" + super.getMaxSpeed() +
                ", weight=" + super.getWeight() +
                ", brand=" + super.getBrand();
    }

}
