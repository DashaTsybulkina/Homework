package model;

import java.util.ArrayList;
import java.util.Objects;

public class Shop {
     private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        if (!hasExistsProduct(product.getId())) {
            products.add(product);
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    private boolean hasExistsProduct(Integer id) {
        for (Product value : products) {
            if (Objects.equals(value.getId(), id)) {
                return true;
            }
        }
        return false;
    }

    public void deleteProduct(Integer id) {
        products.removeIf(product -> Objects.equals(product.getId(), id));
    }

    public void editProduct(Product product) {
        for (Product value : products) {
            if (Objects.equals(value.getId(), product.getId())) {
                value.setName(product.getName());
                value.setPrice(product.getPrice());
            }
        }
    }

}
