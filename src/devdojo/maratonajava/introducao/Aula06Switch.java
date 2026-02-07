package devdojo.maratonajava.introducao;

//switch é um condicional utilizado pra usar de forma mais simples e organizado
//exemplo condição de ser homem ou mulher, etc...
//usamos char, int, byte, short, enum, String em switch

public class Aula06Switch {
    public static void main(String[] args) {
        char dia = 6;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println(("Quinta"));
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }


        char genero = 'M';

        switch (genero) {
            case 'M':
                System.out.println("Abra a aba feminina");
                break;
            case 'H':
                System.out.println("Abra a aba masculina");
                break;
            default:
                System.out.println("Gênero incorreto");
                break;
        }

    }
}
