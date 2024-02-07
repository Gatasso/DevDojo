package academy.devdojo.aulas.Exceptions.desafios.Problematica5.Entities;

import academy.devdojo.aulas.Exceptions.desafios.Problematica5.Exceptions.OutOfStorageException;

public class Product {
    private final String name;
    private int quantity;

    public Product(String name, int initialQuantity) {
        this.name = name;
        this.quantity = initialQuantity;
    }

    public void removeItems(int quantityOnCart)throws OutOfStorageException {
        if (quantityOnCart > this.quantity){
            throw new OutOfStorageException();
        }else {
            this.quantity -= quantityOnCart;
        }
    }

    @Override
    public String toString() {
        return "There is " + quantity +" " + name + " available";
    }
}
