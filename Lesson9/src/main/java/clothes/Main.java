package clothes;

import clothes.boots.AdidasBoot;
import clothes.boots.NikeBoot;
import clothes.jackets.NikeJacket;
import clothes.jackets.ZaraJacket;
import clothes.pants.CappaPant;
import clothes.pants.JeansPant;

public class Main {
    public static void main(String[] args) {
        People Artem = new People(new AdidasBoot(), new ZaraJacket(), new CappaPant(), "Artem");
        Artem.takeOff();
        People Vasya = new People(new NikeBoot(), new NikeJacket(), new JeansPant(), "Vasya");
        Vasya.putOn();
    }
}
