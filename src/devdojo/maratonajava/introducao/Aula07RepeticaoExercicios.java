package devdojo.maratonajava.introducao;

public class Aula07RepeticaoExercicios {
    public static void main(String[] args) {
        //Imprima valores pares ate 1 milhao

        for (int a = 0; a <= 1000000; a++) {

            if (a % 2 == 0) {
                System.out.println("valores pares:" + a);
            }

        }
        System.out.println("-----------------------");
        ;

        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado;
        //carro 50000
        //valor da parcela tem q ser >= 1000

        double valorCarro = 50000;

        for (int parcela = 1; parcela < valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;

            if (valorParcela < 5000) {
                break;
            }
            System.out.println("a parcela "+ parcela + " equivale a R$ " +valorParcela);
        }

        //imprima de 1 a 40 mas pule os divisores por 4 com continue

        System.out.println("--------------");

        for (int value = 0; value <= 40; value++) {

            if (value % 4 == 0) {
                continue;
            }

            System.out.println(value);
        }
    }

}
