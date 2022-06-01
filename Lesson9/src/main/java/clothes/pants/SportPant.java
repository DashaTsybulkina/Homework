package clothes.pants;

public class SportPant implements IPant {
    @Override
    public void takeOff() {
        System.out.println("Сняли штаны спортивные");
    }

    @Override
    public void putOn() {
        System.out.println("Надели штаны спортивные");
    }
}
