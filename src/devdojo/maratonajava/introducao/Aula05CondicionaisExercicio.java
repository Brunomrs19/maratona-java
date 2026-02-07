package devdojo.maratonajava.introducao;

public class Aula05CondicionaisExercicio {
    public static void main(String[] args) {

        double salary = 50000;
        double tax = 9.7;
        double tax2 = 36.35;
        double tax3 = 49.50;
        double valueTax = (9.7/100) * salary;
        double valueTax2 = (36.35/100) * salary;
        double valueTax3 = (49.50/100) * salary;

        if (salary <= 0) {
            System.out.println("Erro ao verificar salário.");
        } else if (salary < 34713 ) {
            System.out.println("Você deve pagar: " + tax + "% de taxa, valor equivalente a: " + valueTax + "R$");
        } else if (salary < 68507) {
            System.out.println("Você deve pagar: " + tax2 + "% de taxa, valor equivalente a: " + valueTax2 + "R$");
        } else {
            System.out.println("Você deve pagar: " + tax3 + "% de taxa, valor equivalente a: " + valueTax3 + "R$");
        }
    }
}
