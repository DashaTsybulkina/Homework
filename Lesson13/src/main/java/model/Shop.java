package model;

import java.util.ArrayList;
import java.util.Objects;

public class Shop {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        for (Product value : products)
            if (Objects.equals(value.getID(), product.getID())) {
                break;
            }
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void deleteProduct(Integer id) {
        products.removeIf(product -> Objects.equals(product.getID(), id));
    }

    public void editProduct(Product product) {
        for (Product value : products)
            if (Objects.equals(value.getID(), product.getID())) {
                value.setName(product.getName());
                value.setPrice(product.getPrice());
            }
    }

}
