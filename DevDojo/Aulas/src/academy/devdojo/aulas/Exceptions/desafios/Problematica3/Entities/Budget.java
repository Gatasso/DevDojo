package academy.devdojo.aulas.Exceptions.desafios.Problematica3.Entities;

import academy.devdojo.aulas.Exceptions.desafios.Problematica3.Exceptions.NotBudgetEnoughException;

public class Budget {
    private double budget;

    public Budget() {
        this.budget = 1000;
    }
    public void transfer(double amount) throws NotBudgetEnoughException {
        if (amount > this.budget){
            throw new NotBudgetEnoughException();
        } else{
            this.budget -= amount;
        }
    }

    public double getBudget() {
        return budget;
    }
}
