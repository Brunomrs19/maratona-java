package devdojo.maratonajava.introducao;

public class Aula05Condicionais {
    public static void main(String[] args) {

        int idade = 18;
        boolean isVerificacao = idade >= 18;

        if(isVerificacao) {
            System.out.println("Entrada permitida, você é maior de idade.");
        }


        //!verificação == (verificacao == false)
        int idade2 = 15;
        boolean isVerificacao2 = idade2 >= 18;

        if (!isVerificacao2) {
            System.out.println("Entrada inválida, volte ano que vem.");
        }
    }
}
