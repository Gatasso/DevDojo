package academy.devdojo.aulas.Exceptions.desafios.Problematica3;

import academy.devdojo.aulas.Exceptions.desafios.Problematica3.Entities.Account;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account acc01 = new Account("JayJay");
        System.out.println("Which operation would you like to do today?");
        System.out.println("1-Transfer // // 2-Payment");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                acc01.transfer(scanner);
                break;
            case 2:
                acc01.payment(scanner);
                break;
        }
    }
}
