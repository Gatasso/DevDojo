package academy.devdojo.aulas.Exceptions.desafios.Problematica5;

import academy.devdojo.aulas.Exceptions.desafios.Problematica5.Entities.Product;
import academy.devdojo.aulas.Exceptions.desafios.Problematica5.Entities.ShoppingCart;
import academy.devdojo.aulas.Exceptions.desafios.Problematica5.Exceptions.OutOfStorageException;
import academy.devdojo.aulas.Exceptions.desafios.Problematica5.Exceptions.ProductDontExistException;

public class ShopApp {
    public static void main(String[] args) {
        Product keyboard = new Product("Keyboard",5);
        Product mouse = new Product("Mouse",10);
        Product mousePad = new Product("MousePad",7);
        Product nullProduct = null;
        ShoppingCart yourShoppingCart= new ShoppingCart();
        System.out.println(keyboard);
        System.out.println(mouse);
        System.out.println(mousePad);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        try {
            yourShoppingCart.addCart(keyboard, 5);
            System.out.println("Added to your cart");
            System.out.println(keyboard);
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            yourShoppingCart.addCart(mouse, 5);
            System.out.println("Added to your cart");
            System.out.println(mouse);
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            yourShoppingCart.addCart(mousePad, 5);
            System.out.println("Added to your cart");
            System.out.println(mousePad);
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            yourShoppingCart.addCart(nullProduct,1);
        }catch (OutOfStorageException e){
            e.printStackTrace();
            System.out.println("Quantity not available on stock");
        } catch (ProductDontExistException e){
            e.printStackTrace();
            System.out.println("Product not available on our catalogue");
        }
    }
}
