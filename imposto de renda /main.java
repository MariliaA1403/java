import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o salário bruto
        System.out.print("Digite o seu salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        // Dedução padrão para dependentes (valor atual pode variar)
        System.out.print("Digite o número de dependentes: ");
        int dependentes = scanner.nextInt();
        double deducaoDependentes = dependentes * 189.59;

        // Dedução da contribuição ao INSS (pode ser baseada no cálculo anterior)
        double contribuicaoINSS = calcularContribuicaoINSS(salarioBruto);

        // Base de cálculo para o IRRF
        double baseCalculoIRRF = salarioBruto - contribuicaoINSS - deducaoDependentes;

        double impostoRenda = 0.0;

        // Cálculo do IRRF com base nas alíquotas vigentes
        if (baseCalculoIRRF <= 1903.98) {
            impostoRenda = 0.0; // Isento
        } else if (baseCalculoIRRF <= 2826.65) {
            impostoRenda = (baseCalculoIRRF - 1903.98) * 0.075 - 142.80;
        } else if (baseCalculoIRRF <= 3751.05) {
            impostoRenda = (baseCalculoIRRF - 2826.65) * 0.15 - 354.80;
        } else if (baseCalculoIRRF <= 4664.68) {
            impostoRenda = (baseCalculoIRRF - 3751.05) * 0.225 - 636.13;
        } else {
            impostoRenda = (baseCalculoIRRF - 4664.68) * 0.275 - 869.36;
        }

        // Exibe o valor do IRRF descontado
        System.out.printf("Imposto de Renda Retido na Fonte: R$ %.2f%n", impostoRenda);

        scanner.close();
    }

    // Método auxiliar para calcular a contribuição ao INSS
    public static double calcularContribuicaoINSS(double salarioBruto) {
        double contribuicaoINSS = 0.0;

        if (salarioBruto <= 1320.00) {
            contribuicaoINSS = salarioBruto * 0.075;
        } else if (salarioBruto <= 2571.29) {
            contribuicaoINSS = (1320.00 * 0.075) + ((salarioBruto - 1320.00) * 0.09);
        } else if (salarioBruto <= 3856.94) {
            contribuicaoINSS = (1320.00 * 0.075) + ((2571.29 - 1320.00) * 0.09) + ((salarioBruto - 2571.29) * 0.12);
        } else if (salarioBruto <= 7507.49) {
            contribuicaoINSS = (1320.00 * 0.075) + ((2571.29 - 1320.00) * 0.09) + 
                               ((3856.94 - 2571.29) * 0.12) + ((salarioBruto - 3856.94) * 0.14);
        } else {
            contribuicaoINSS = (1320.00 * 0.075) + ((2571.29 - 1320.00) * 0.09) + 
                               ((3856.94 - 2571.29) * 0.12) + ((7507.49 - 3856.94) * 0.14);
        }

        return contribuicaoINSS;
    }
}
