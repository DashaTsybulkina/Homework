package main;

import model.Product;
import model.Shop;
import model.User;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static final int USERS_COUNT = 12;
    public static final int PRODUCT_LIMIT = 5;
    public static final int CASH_REGISTER = 5;

    public static void main(String[] args) {
        Shop shop = new Shop(CASH_REGISTER);
        Random random = new Random();
        for (int i = 0; i < USERS_COUNT; i++) {
            ArrayList<Product> products = new ArrayList<>();
            for (int j = 0; j < random.nextInt(PRODUCT_LIMIT); j++) {
                products.add(new Product(random.nextInt(100) + 1));
            }
            User user = new User(i + 1, products, shop);
            user.start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
