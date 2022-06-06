package car;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car("Audi", 50, 30);
        Car mitsubishi = new Car("Mitsubishi", 300, 1);
        Car mercedes = new Car("Mercedes", 160, 1000);
        try {
            audi.start();
        } catch (CarException e) {
            e.printStackTrace();
        }
        try {
            mitsubishi.start();
        } catch (CarException e) {
            e.printStackTrace();
        }
        try {
            mercedes.start();
        } catch (CarException e) {
            e.printStackTrace();
        }

    }
}
