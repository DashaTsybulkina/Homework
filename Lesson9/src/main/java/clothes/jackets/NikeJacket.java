package clothes.jackets;

public class NikeJacket implements IJacket {
    @Override
    public void takeOff() {
        System.out.println("Сняли куртку Nike");
    }

    @Override
    public void putOn() {
        System.out.println("Надели куртку Nike");
    }
}
