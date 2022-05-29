package transport;

import lombok.Getter;

@Getter
public abstract class AirTransport extends Transport {
    private double wingspan;
    private int minStripe;


    public AirTransport(int power, int maxSpeed, int weight, String brand, double wingspan, int minStripe) {
        super(power, maxSpeed, weight, brand);
        this.minStripe = minStripe;
        this.wingspan = wingspan;
    }
}
