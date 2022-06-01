package clothes.boots;

public class AdidasBoot implements IBoot {
    @Override
    public void takeOff() {
        System.out.println("Сняли ботинки Adidas");
    }

    @Override
    public void putOn() {
        System.out.println("Надели ботинки Adidas");
    }
}
