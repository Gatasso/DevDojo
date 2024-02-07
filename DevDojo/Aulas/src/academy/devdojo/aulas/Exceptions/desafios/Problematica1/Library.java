package academy.devdojo.aulas.Exceptions.desafios.Problematica1;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book1 = new Book("Estoic Diary", "001");
        Book book2 = new Book("Dom Casmurro", "002");
        Book book3 = new Book("Clockwork Orange", "003");
        Book book4 = new Book("Animal Farm ", "004");
        Book[] collection = {book1,book2,book3,book4};
        try {
            System.out.println("What book are you looking for? Enter the name:");
            String bookName = scanner.nextLine();
            rentBook(bookName,collection);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Book rentBook(String userWishBook,Book[]collection) throws BookNotFoundException{
        for (Book book : collection) {
            if (!userWishBook.equals(book.getName())){
                throw new BookNotFoundException();
            } System.out.println("The book " + book.getName() + " is now rented for 7 days." );
            return book;
        } return null;
    }
}
