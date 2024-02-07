package academy.devdojo.aulas.Exceptions.desafios.Problematica5.Entities;

import academy.devdojo.aulas.Exceptions.desafios.Problematica5.Exceptions.OutOfStorageException;
import academy.devdojo.aulas.Exceptions.desafios.Problematica5.Exceptions.ProductDontExistException;

import java.util.Arrays;

public class ShoppingCart {
    private Product[] products;
    private int size;

    public ShoppingCart() {
        int INITIAL_SIZE = 5;
        products = new Product[INITIAL_SIZE];
        size = 0;
    }

    public void addCart(Product product, int quantity) throws OutOfStorageException, ProductDontExistException {
        if (product == null) {
            throw new ProductDontExistException();
        } else {
            products[size] = product;
            product.removeItems(quantity);
            size++;
            if (size == products.length) {
                increaseCapacity();
            }
        }
    }

    private void increaseCapacity() {
        int newCapacity = products.length * 2;
        products = Arrays.copyOf(products, newCapacity);
    }
}