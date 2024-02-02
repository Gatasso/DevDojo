package academy.devdojo.aulas.Exceptions.exercicios;

import java.io.File;
import java.io.IOException;

public class Resolucao {
    public static void main(String[] args) {
//        System.out.println(division(1,0));
//*********************************************************
//        createFile();
//*********************************************************
//     getIdade(101);
//        try {
//            createFile();
//        }catch (IOException e){
//            e.printStackTrace();
//            System.out.println("Arquivo não criado");
//        }
//*********************************************************
//        int[] pair = {2, 4, 6, 8, 0};
//        int[] odd = {1, 3, 5, 7, 9};
//        pairOrOdd(pair, odd);
//        try {
//            createFile();
//        }catch (IOException e){
//            e.printStackTrace();
//            System.out.println("Arquivo não criado");
//        }
        System.out.println(checkNumbers(10,0,5));
    }

    //    public static int division(int a, int b){
//        try {
//            return a/b;
//        } catch (ArithmeticException e){
//            System.out.println("Não pode se dividir por 0");
//            e.printStackTrace();
//        } return 0;
//    }
//*********************************************************
//    public static void createFile(){
//        File file = new File("Arquivo/newFile.txt");
//        try {
//            file.createNewFile();
//            System.out.println("Arquivo criado com sucesso: " + file);
//        }catch (IOException e){
//            e.printStackTrace();
//            System.out.println("Arquivo não criado");
//        }
//    }
//*********************************************************
//    public static void getIdade(int age){
//        if (age < 0 || age >= 100){
//            throw new IllegalArgumentException("Idade inválida");
//        }
//        System.out.println("Idade válida");
//    }
//*********************************************************
//        public static void createFile()throws IOException{
//        File file = new File("Arquivo/newFile2.txt");
//        file.createNewFile();
//        System.out.println("Arquivo criado com sucesso em: " + file.getPath());
//    }
//*********************************************************
//    public static void pairOrOdd(int[] pair, int[] odd) {
//        int[] pairAndOdd = new int[5];
//        try {
//                for (int i = 0; i < odd.length; i++) {
//                    pairAndOdd[i] =  odd[i] / pair[i];
//                }
//
//            for (int i = 0; i < pairAndOdd.length; i++) {
//                System.out.println(pairAndOdd[i]);
//            }
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//            System.out.println("Division could not be done. Math error.");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//            System.out.println("Out of bounds. More arguments than expected.");
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//            System.out.println("Invalid argument. Only numbers acceptable");
//        }
//    }
//    public static void createFile()throws IOException{
//        File file = new File("Arquivo/newFile2.txt");
//        file.createNewFile();
//        System.out.println("Arquivo criado com sucesso em: " + file.getPath());
//    }
    public static int checkNumbers(int a, int b, int c) {
        if (a == 0 || b == 5 || c == 10){
            throw new RuntimeException("Invalid Number");
        } return a+b+c;
    }
}
