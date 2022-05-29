package transport;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

}
