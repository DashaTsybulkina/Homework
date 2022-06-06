package car;

import lombok.*;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {
    private String brand;
    private double speed;
    private double price;

    public void start() throws CarException {
        Random random = new Random();
        int number = random.nextInt(21);
        if (number % 2 == 0) {
            System.out.println("Машина " + this.brand + " заведена");
        } else {
            throw new CarException();
        }
    }
}

