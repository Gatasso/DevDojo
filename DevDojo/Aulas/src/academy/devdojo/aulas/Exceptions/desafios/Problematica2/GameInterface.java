package academy.devdojo.aulas.Exceptions.desafios.Problematica2;

import academy.devdojo.aulas.Exceptions.desafios.Problematica2.Exceptions.UnderAgeException;

import java.util.Scanner;

public class GameInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Bem vindo ao MGRGAME");
            System.out.println("Nos informe seu nome e sua idade para continuar:");
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            checkAge(age);
        } catch (UnderAgeException e){
            e.printStackTrace();
        }
    }
    private static boolean checkAge(int age)throws UnderAgeException {
        if (age < 13) throw new UnderAgeException();
        else return true;
    }
}
