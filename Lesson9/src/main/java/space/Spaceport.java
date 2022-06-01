package space;

public class Spaceport {
    void launch(IStart ob) {
        ob.preLaunchCheck();
        if (!ob.preLaunchCheck())
            System.out.println("preLaunch failure");
        else {
            ob.engineLaunch();
            for (int i = 10; i >= 0; i--) {
                System.out.println(i + "..");
            }
            ob.start();
        }
    }
}
