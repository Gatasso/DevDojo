package academy.devdojo.aulas.Exceptions.desafios.Problematica3.Entities;

import academy.devdojo.aulas.Exceptions.desafios.Problematica3.Exceptions.NotBudgetEnoughException;

import java.util.Scanner;

public class Account implements Operations {
    Budget budget;
    String name;

    public Account(String name) {
        this.name = name;
        this.budget = new Budget();
    }

    @Override
    public void transfer(Scanner scanner) {
        boolean isExecuted = false;
        while (!isExecuted) {
            System.out.println("Transfer Value");
            double value = scanner.nextDouble();
            try {
                budget.transfer(value);
                System.out.println("Transfer Done");
                System.out.println(getName() + ",your budget is now: " + budget.getBudget());
                isExecuted = true;
            } catch (NotBudgetEnoughException e) {
                e.printStackTrace();
                System.out.println("The transfer couldnt be done. Try Again");
            }
        }
    }

    @Override
    public void payment(Scanner scanner) {
        boolean isPaid = false;
        while (!isPaid) {
        System.out.println("Payment Value:");
        double value = scanner.nextDouble();
            try {
                budget.transfer(value);
                System.out.println("Payment done");
                System.out.println(getName() + ",your budget is now: " + budget.getBudget());
                isPaid = true;
            } catch (NotBudgetEnoughException e) {
                e.printStackTrace();
                System.out.println("Payment couldnt be done. Check the value");
            }
        }
    }

    public String getName() {
        return name;
    }
}
