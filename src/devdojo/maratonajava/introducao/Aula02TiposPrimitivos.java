package devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula02TiposPrimitivos {
    public static void main (String[] args) {
        //tipos primitivos int, float, char, byte, short, long, boolean
        int age = 9;
        float height = 1.80F;
        double size = 1.80D;
        char ascii = 57;
        char unicode = '\u002A';
        byte ageByte = 100;
        short ageShort = 4;
        long ageLong = 130;
        boolean falso = false;
        boolean verdadeiro = true;

        //casting = forçando long ser inteiro
        long dados = (int) 10000000000L;

        System.out.println(ascii);
        System.out.println(unicode);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(dados);

        //String é um type reference

        String fabula = "O gato roeu o rato";

        System.out.println("A história é: " + fabula);
    }
}
