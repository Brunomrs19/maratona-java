package devdojo.maratonajava.introducao;

public class Aula05Condicionais02 {
    public static void main(String[] args) {

        double salario = 430;

        String mensagemDoar = "Eu irei fazer uma doação.";
        String mensagemNaoDoar = "Não vale a pena doar.";

        //(condicao) ? verdadeiro : falsoS

        //melhor declarar a variavel já dando valor a ela.
        String resultado = (salario > 1600) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }

}
