package robot.legs;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SonyLeg implements ILeg {
    private int price;

    @Override
    public void step() {
        System.out.println("Делает шаг Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
