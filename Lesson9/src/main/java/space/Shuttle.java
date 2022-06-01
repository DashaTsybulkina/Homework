package space;

public class Shuttle implements IStart {
    @Override
    public boolean preLaunchCheck() {
        return (int) (Math.random() * 11) > 3;
    }

    @Override
    public void engineLaunch() {
        System.out.println("Двигатели Шатла запущены.\n" +
                "Все системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
