package devdojo.maratonajava.introducao;

public class Aula07EstruturaDeRepeticao01 {
    public static void main(String[] args) {

        int i = 0;
        int a = 25;
        int b;

        while (i < 10) {
            System.out.println("valor de i: " + i);
            i++;
        }
        ;

        do {
            System.out.println("valor de a: " + a);
            a++;

        } while (a < 5);

        for (b = 1  ; b < 100; b = b + 5) {
            System.out.println("valor de b: " + b);
        }
    }
}
