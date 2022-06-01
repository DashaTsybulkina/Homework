package clothes.boots;

public class FilaBoot implements IBoot {
    @Override
    public void takeOff() {
        System.out.println("Сняли ботинки Fila");
    }

    @Override
    public void putOn() {
        System.out.println("Надели ботинки Fila");
    }
}
