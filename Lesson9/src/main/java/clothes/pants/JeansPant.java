package clothes.pants;

public class JeansPant implements IPant {
    @Override
    public void takeOff() {
        System.out.println("Сняли джинсы");
    }

    @Override
    public void putOn() {
        System.out.println("Надели джинсы");
    }
}
