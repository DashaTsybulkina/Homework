package car;

public class CarException extends Exception {
    public CarException() {
        super("Внимение! Рандомом выбрано нечетное число. Машина не заведена");
    }

    public CarException(String message) {
        super(message);
    }
}
