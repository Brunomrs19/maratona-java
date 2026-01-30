package devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
Confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
        public static void main (String[] args) {
            String nome = "Bruno Mário";
            String endereco = "Qn 311 - Samambaia";
            double salario = 2500;
            String data = "26/20/2001";
            String tarefa = "Eu " + nome + ", morando no endereço " + endereco + ", Confirmo que recebi o salário de " + salario + ", na data " + data;

            System.out.println(tarefa);

        }
}
