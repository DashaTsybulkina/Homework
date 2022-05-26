package flower_shop;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Bouquet {
    private Flower[] flowers;

    public int getPriceFlowers() {
        int price = 0;
        for (Flower flower : flowers) {
            price += flower.getPrice();
        }
        return price;
    }
}
