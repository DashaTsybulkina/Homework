package clothes.jackets;

public class ZaraJacket implements IJacket {
    @Override
    public void takeOff() {
        System.out.println("Сняли куртку Zara");
    }

    @Override
    public void putOn() {
        System.out.println("Надели куртку Zara");
    }
}
