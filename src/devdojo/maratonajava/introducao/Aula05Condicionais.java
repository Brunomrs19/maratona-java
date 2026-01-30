package devdojo.maratonajava.introducao;

public class Aula05Condicionais {
    public static void main(String[] args) {

        int idade = 18;
        boolean isVerificacao = idade >= 18;

        //if
        if (isVerificacao) {
            System.out.println("Entrada permitida, você é maior de idade.");
        }


        //!verificação == (verificacao == false)
        int idade2 = 15;
        boolean isVerificacao2 = idade2 >= 18;

        if (!isVerificacao2) {
            System.out.println("Entrada inválida, volte ano que vem.");
        }

        //else

        int dinheiro = 500000;
        int valorCarro = 141000;
        boolean isCompravel = dinheiro > valorCarro;

        if (isCompravel) {
            System.out.println("Parabéns, você acabou de comprar um carro.");
        } else {
            System.out.println("Podemos parcelar");
        }

        //else ifS

        int idadeJogador = 25;

        if (idadeJogador <0) {
         System.out.println("Idade inválida");}
        else if (idadeJogador > 20) {
            System.out.println("Selecionado pro profissional.");
        } else if (idadeJogador > 17) {
            System.out.println("Selecionado pro sub-20");
        } else if(idadeJogador > 15) {
            System.out.println("Selecionado pro sub-17");
        } else if(idadeJogador > 13) {
            System.out.println("Selecionado pro sub-15");
        } else if(idadeJogador > 10) {
            System.out.println("Selecionado pro sub-13");
        } else {
            System.out.println("Selecionado pro mirim");
        }
    }
}
