package car;

public class GasTank {
    private double countGas;
    private int maxVolume = 0;

    public GasTank(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public GasTank(double countGas, int maxVolume) {
        this.countGas = countGas;
        this.maxVolume = maxVolume;
    }

    @Override
    public String toString() {
        return "GasTank{" +
                "countGas=" + countGas +
                ", maxVolume=" + maxVolume +
                '}';
    }

    public void setCountGas(double countGas) {
        this.countGas = countGas;
    }

    public double getCountGas() {
        return countGas;
    }

    public void addGas(double refuelGas) {
        if (countGas + refuelGas < maxVolume) {
            this.countGas += refuelGas;
        } else {
            System.out.println("Tank designed for " + this.maxVolume + " l");
        }

    }
}
