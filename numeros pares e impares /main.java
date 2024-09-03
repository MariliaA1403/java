import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        // Determina qual número é o menor e qual é o maior
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        // Exibe os números pares entre os dois números
        System.out.println("Números pares entre " + menor + " e " + maior + ":");
        for (int i = menor; i <= maior; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // Pula uma linha

        // Exibe os números ímpares entre os dois números
        System.out.println("Números ímpares entre " + menor + " e " + maior + ":");
        for (int i = menor; i <= maior; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
