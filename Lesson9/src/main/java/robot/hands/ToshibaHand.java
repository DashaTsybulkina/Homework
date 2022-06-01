package robot.hands;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ToshibaHand implements IHand {
    private int price;

    @Override
    public void upHand() {
        System.out.println("Поднимает руку Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
