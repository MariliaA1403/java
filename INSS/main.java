import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o salário bruto
        System.out.print("Digite o seu salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        double contribuicaoINSS = 0.0;

        // Cálculo da contribuição ao INSS com base nas alíquotas vigentes
        if (salarioBruto <= 1320.00) {
            contribuicaoINSS = salarioBruto * 0.075; // 7.5%
        } else if (salarioBruto <= 2571.29) {
            contribuicaoINSS = (1320.00 * 0.075) + ((salarioBruto - 1320.00) * 0.09); // 9%
        } else if (salarioBruto <= 3856.94) {
            contribuicaoINSS = (1320.00 * 0.075) + ((2571.29 - 1320.00) * 0.09) + ((salarioBruto - 2571.29) * 0.12); // 12%
        } else if (salarioBruto <= 7507.49) {
            contribuicaoINSS = (1320.00 * 0.075) + ((2571.29 - 1320.00) * 0.09) + 
                               ((3856.94 - 2571.29) * 0.12) + ((salarioBruto - 3856.94) * 0.14); // 14%
        } else {
            contribuicaoINSS = (1320.00 * 0.075) + ((2571.29 - 1320.00) * 0.09) + 
                               ((3856.94 - 2571.29) * 0.12) + ((7507.49 - 3856.94) * 0.14); // Teto de contribuição
        }

        // Calcula o salário líquido
        double salarioLiquido = salarioBruto - contribuicaoINSS;

        // Exibe o valor da contribuição e o salário líquido
        System.out.printf("Contribuição ao INSS: R$ %.2f%n", contribuicaoINSS);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}
