package clothes.boots;

public class NikeBoot implements IBoot {
    @Override
    public void takeOff() {
        System.out.println("Сняли ботинки Nike");
    }

    @Override
    public void putOn() {
        System.out.println("Надели ботинки Nike");
    }
}
