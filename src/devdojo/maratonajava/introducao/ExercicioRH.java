package devdojo.maratonajava.introducao;

public class ExercicioRH {
    public static void main(String[] args) {

        // P = pj / C = clt / E = estagio

        String name = "Bruno";
        int idade = 19;
        double salaryBruto = 2600;
        double taxSalary = 0.15 * salaryBruto;
        double salaryLiquido = salaryBruto - taxSalary;

        //verificar idade do contratado
        String naoAutorizado = "Você precisa da autorização dos seus pais";
        String autorizado = "Prosseguir com a admissão.";

        String mensagem = (idade < 18) ? naoAutorizado : autorizado;
        System.out.println(mensagem);

        //Exibir cargo
        String cargoSenior = "Cargo de nível senior";
        String cargoJuniorPlenio = "Cargo de nível junior/plenio";
        String cargoEstagiario = "Cargo de nivel estagiário";

        if (salaryLiquido >= 5000) {
            System.out.println(cargoSenior);
        } else if (salaryLiquido >= 2500) {
            System.out.println(cargoJuniorPlenio);
        } else if (salaryLiquido > 0) {
            System.out.println(cargoEstagiario);
        } else {
            System.out.println("Cargo indisponivel");
        }
        ;

        //Verificar contrato
        String tipoRegime;
        char contrato = 'E';

        switch (contrato) {
            case 'P':
                tipoRegime = "Regime PJ";
                break;
            case 'C':
                tipoRegime = "Regime clt";
                break;
            case 'E':
                tipoRegime = "Regime estágio";
                break;
            default:
                System.out.println("Tipo de contrato inexistente");
                break;
        }
        ;


    }
}
