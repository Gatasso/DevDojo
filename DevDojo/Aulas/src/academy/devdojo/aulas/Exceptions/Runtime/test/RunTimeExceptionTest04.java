package academy.devdojo.aulas.Exceptions.Runtime.test;

import javax.sound.midi.Soundbank;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }
    }
}
