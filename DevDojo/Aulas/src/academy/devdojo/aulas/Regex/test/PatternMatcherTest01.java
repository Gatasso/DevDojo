package academy.devdojo.aulas.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // metodos e caracteres
        String regex = "ab";
        String texto = "abcabdabeabf";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.print("Posicoes encontradas: ");


        while(matcher.find()){
            System.out.print(matcher.start()+" ");
            System.out.print(matcher.end() +" /");
        }
    }
}
