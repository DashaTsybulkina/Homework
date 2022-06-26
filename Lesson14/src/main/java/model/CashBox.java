package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CashBox {
    private static int cashBoxCounter;
    private final Object lock = new Object();
    private final Integer id;

    public CashBox() {
        id = ++cashBoxCounter;
    }

    public void serveCustomer(User user) {
        synchronized (this) {
            System.out.printf("Касса #%s обслуживает: %s\n", id, user.getUserName());
            for (Product product : user.getProducts()) {
                System.out.printf("%s оплачивает %s\n", user.getUserName(), product);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
        }
    }

}
