package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Random;

@Getter
@AllArgsConstructor
public class User extends Thread {
    Shop shop;
    private List<Product> products;
    private final String userName;

    public User(Integer id, List<Product> products, Shop shop) {
        this.userName = "Пользователь №" + id;
        this.products = products;
        this.shop = shop;
    }

    @Override
    public void run() {
        Random random = new Random();
        CashBox[] cashBoxes = shop.getCashBoxes();
        CashBox box = cashBoxes[random.nextInt(cashBoxes.length)];
        System.out.println(userName + " Использует кассу №" + box.getId());
        box.serveCustomer(this);
    }
}
