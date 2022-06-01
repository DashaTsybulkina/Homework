package robot;

import lombok.*;
import robot.hands.IHand;
import robot.heads.IHead;
import robot.legs.ILeg;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }
}
