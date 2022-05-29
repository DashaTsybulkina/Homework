package transport;

public class CivilianTransport extends AirTransport {
    private int maxCountOfPassenger;
    private boolean isHaveBusinessClass;

    public CivilianTransport(int power, int maxSpeed, int weight, String brand, double wingspan, int minStripe, int maxCountOfPassenger, boolean isHaveBusinessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minStripe);
        this.isHaveBusinessClass = isHaveBusinessClass;
        this.maxCountOfPassenger = maxCountOfPassenger;
    }


    public void checkPassenger(int passenger) {
        if (passenger <= maxCountOfPassenger) {
            System.out.println("The plane is full");
        } else {
            System.out.println("Need a bigger plane");
        }
    }

    public String info() {
        return "CivilianTransport{" +
                "countOfPassenger=" + maxCountOfPassenger +
                ", isHaveBusinessClass=" + isHaveBusinessClass +
                ", wingspan=" + super.getWingspan() +
                ", minStripe=" + super.getMinStripe() +
                ", power=" + super.getPower() +
                "(hp), or " + super.getPower() * 0.74 +
                "(kW), maxSpeed=" + super.getMaxSpeed() +
                ", weight=" + super.getWeight() +
                ", brand=" + super.getBrand();
    }
}
