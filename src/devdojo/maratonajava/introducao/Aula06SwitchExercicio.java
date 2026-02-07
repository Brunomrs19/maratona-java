package devdojo.maratonajava.introducao;

public class Aula06SwitchExercicio {
    public static void main(String[] args) {
        //Dados os valores 1 a 7, imprimir se é dia útil ou final de semana
        //Domingo = 1

        char dia = 1;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
     }
}
