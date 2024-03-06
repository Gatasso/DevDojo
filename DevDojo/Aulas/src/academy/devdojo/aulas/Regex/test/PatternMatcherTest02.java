package academy.devdojo.aulas.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // metodos e caracteres
        String regex = "\\D";
//        String regex = "\\d";
//        String texto = "abcabdabeabf";
        String texto2 = "2new2ef5f4gs2dFe5";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posicoes encontradas: ");

        while(matcher.find()){
            System.out.print(matcher.start()+" "+ matcher.group()+" \n");

        }
    }
}
