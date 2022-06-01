package robot.hands;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SamsungHand implements IHand {
    private int price;

    @Override
    public void upHand() {
        System.out.println("Поднимает руку Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
