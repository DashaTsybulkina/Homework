package car;

public class Car {
    private GasTank gasTank;
    private Engine engine;
    private int countAllDistance;
    private final int DISTANCE = 100;
    private final int FINAL_OF_DISTANCE = 20;
    private String brand;
    private String yearsOfRelease;

    public Car(GasTank gasTank, Engine engine) {
        this.gasTank = gasTank;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                " gasTank=" + gasTank +
                ", engine=" + engine +
                ", countAllDistance=" + countAllDistance +
                ", DISTANCE=" + DISTANCE +
                ", FINAL_OF_DISTANCE=" + FINAL_OF_DISTANCE +
                ", brand='" + brand + '\'' +
                ", yearsOfRelease='" + yearsOfRelease + '\'' +
                '}';
    }

    public Car(GasTank gasTank, Engine engine, int countAllDistance, String brand, String yearsOfRelease) {
        this.gasTank = gasTank;
        this.engine = engine;
        this.countAllDistance = countAllDistance;
        this.brand = brand;
        this.yearsOfRelease = yearsOfRelease;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYearsOfRelease(String yearsOfRelease) {
        this.yearsOfRelease = yearsOfRelease;
    }

    public void refuelGas(double addGas) {
        gasTank.addGas(addGas);
        System.out.println("Tank refueled for " + gasTank.getCountGas() + "l");
    }

    public void getGasCount() {
        System.out.println("Count of gas is " + gasTank.getCountGas());
    }

    public void setCountAllDistance(int countAllDistance) {
        this.countAllDistance = countAllDistance;
    }

    public void start() {
        if (gasTank.getCountGas() - FINAL_OF_DISTANCE > 0) {
            engine.setStart(true);
            System.out.println("Car is starting");
        } else {
            System.out.println("Not enough gas for starting engine");
        }
    }

    public void drive() {
        if (engine.getIsStart()) {
            System.out.println("Car went");
        } else {
            System.out.println("Engine is not working. Car can`t drive");
        }
    }

    public void mute() {
        engine.setStart(false);
        System.out.println("Car is muted");
        countAllDistance += DISTANCE;
        gasTank.setCountGas(gasTank.getCountGas() - FINAL_OF_DISTANCE);
        System.out.println("Car was driving" + DISTANCE + " km, in tank left " + gasTank.getCountGas() + " l");
    }

    public void getCountOfDistance() {
        System.out.println("Distance is " + countAllDistance);
    }
}
