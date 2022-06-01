package clothes;

import clothes.boots.IBoot;
import clothes.jackets.IJacket;
import clothes.pants.IPant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class People implements IPeople {
    private IBoot boot;
    private IJacket jacket;
    private IPant pant;
    private String name;

    @Override
    public void takeOff() {
        System.out.println(name + " раздевается...");
        boot.takeOff();
        jacket.takeOff();
        pant.takeOff();
    }

    @Override
    public void putOn() {
        System.out.println(name + " одевается...");
        boot.putOn();
        jacket.putOn();
        pant.putOn();
    }
}
