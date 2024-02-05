package academy.devdojo.aulas.Exceptions.desafios.Problematica3;

public class Budget {
    private double budget;
    private final double INITIAL_BUDGET = 1000;

    public Budget() {
        this.budget = INITIAL_BUDGET;
    }
    public double transfer(double amount) throws NotBudgetEnoughException{
        if (amount > this.budget){
            throw new NotBudgetEnoughException();
        } else{
            this.budget -= amount;
            return this.budget;
        }
    }

    public double getBudget() {
        return budget;
    }
}
