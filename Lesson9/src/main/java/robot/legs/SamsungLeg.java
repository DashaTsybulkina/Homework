package robot.legs;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SamsungLeg implements ILeg {
    private int price;

    @Override
    public void step() {
        System.out.println("Делает шаг Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
