package clothes.pants;

public class CappaPant implements IPant {
    @Override
    public void takeOff() {
        System.out.println("Сняли штаны Cappa");
    }

    @Override
    public void putOn() {
        System.out.println("Надели штаны Cappa");
    }
}
