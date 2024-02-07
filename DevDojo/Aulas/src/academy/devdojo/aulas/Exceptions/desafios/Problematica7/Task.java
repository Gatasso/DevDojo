package academy.devdojo.aulas.Exceptions.desafios.Problematica7;

public class Task {
    private int priority;
    private String name;

    public Task(String name,int priority) throws InvalidPriorityException{
        this.name = name;
        if (priority < 1 || priority > 5){
            throw new InvalidPriorityException();
        }
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "The " + name + " Task has a " + priority + " level of priority";
    }
}
