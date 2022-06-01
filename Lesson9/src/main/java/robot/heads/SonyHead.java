package robot.heads;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SonyHead implements IHead {
    private int price;

    @Override
    public void speak() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
