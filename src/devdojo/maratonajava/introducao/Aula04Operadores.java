package devdojo.maratonajava.introducao;


public class Aula04Operadores {
    public static void main(String[] args) {
        //Operadores aritmeticos ( +, -, /, *, %)
        int numero1  = 20;
        int numero2 = 10;
        double numero3 = 10.5;

        int resultado1 = numero1 + numero2;
        double resultado2 = numero1 / (int) numero3;

        System.out.println("20 + 10 = " + resultado1);
        System.out.println("10 / 20 = " + resultado2);

        int resto = 25 % 5;
        System.out.println("resto é: " + resto);

        //Operadores lógicos (< > <= >= == !=)

        boolean isDoisMaiorQueUm = 1 < 2;
        boolean isDoisMenorQueUm = 1 > 2;
        boolean igual = 10 == 20;
        boolean diferente = 25 != 30;

        System.out.println(isDoisMaiorQueUm + " CORRETO");
        System.out.println(isDoisMenorQueUm + " 1 É MENOR DE 2");
        System.out.println("é igual? " + igual);
        System.out.println("é diferente? " + diferente);

        //Operadores lógicos && e || e !
        //AND
        double salario = 1600;
        int idade = 24;

        boolean saida = (idade == 24 && salario < 2000);
        System.out.println("Não pode entrar = " + saida);

        //OR
        double contaCorrente = 45.45;
        double contaCorretora = 130;
        double valorViagem = 2350.35;

        boolean saida2 = valorViagem < contaCorrente || valorViagem < contaCorretora;

        System.out.println("pode viajar? " + saida2);


        //Operadores de atribuição = += -= *= /= %=
        double ganhos = 2000;
        System.out.println("ganho sem aumento = " + ganhos);

        ganhos += 689.99;
        System.out.println("com aumento = " + ganhos);


        //Operadors unários ++;

        int contador = 0;
        contador++; // igual a contador = contador + 1 (incrementa apenas 1);

        int contador2 = 0;
        ++contador2;

        System.out.println("++antes (Primeiro incrementa, depois usa o valor) = "+contador);
        System.out.println("antes++ (Primeiro usa o valor atual, depois incrementa para a próxima linha.) = "+contador2);

        int a = 0;
        int b = 0;

        System.out.println(a++); // imprime 0 dps incrementa
        System.out.println(++b); // incrementa e imprime
        System.out.println(a); // incrementou pós impresso na linha 72
    }
}
