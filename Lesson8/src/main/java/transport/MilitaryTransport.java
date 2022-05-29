package transport;

public class MilitaryTransport extends AirTransport {
    private boolean isHaveEjection;
    private int countOfRocket;

    public MilitaryTransport(int power, int maxSpeed, int weight, String brand, double wingspan, int minStripe, boolean isHaveEjection, int countOfRocket) {
        super(power, maxSpeed, weight, brand, wingspan, minStripe);
        this.isHaveEjection = isHaveEjection;
        this.countOfRocket = countOfRocket;
    }

    public void rocketLaunch() {
        if (countOfRocket > 0) {
            System.out.println("Rocket is launched...");
        } else {
            System.out.println("Rocket is missing");
        }
    }

    public void checkEjection() {
        if (isHaveEjection) {
            System.out.println("Ejection was successful");
        } else {
            System.out.println("You don't have this system");
        }
    }

    public String info() {
        return "MilitaryTransport:" +
                "isHaveEjection=" + isHaveEjection +
                ", countOfRocket=" + countOfRocket +
                ", wingspan=" + super.getWingspan() +
                ", minStripe=" + super.getMinStripe() +
                ", power= " + super.getPower() +
                "(hp), or " + super.getPower() * 0.74 +
                "(kW), maxSpeed= " + super.getMaxSpeed() +
                ", weight=" + super.getWeight() +
                ", brand=" + super.getBrand();
    }

}
