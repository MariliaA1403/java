import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro positivo
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // Inicializa o fatorial em 1
        int fatorial = 1;
        int i = numero;

        // Calcula o fatorial usando um loop while
        while (i > 0) {
            fatorial *= i; // Multiplica o fatorial pelo valor de i
            i--; // Decrementa o valor de i
        }

        // Exibe o resultado
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}
