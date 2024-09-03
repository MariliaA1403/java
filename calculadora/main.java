import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        //primeira questão
        System.out.print("Digite o primeiro número: ");
        int numero1 = leia.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = leia.nextInt(); 

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        
        // Verifica se o segundo número é zero antes de realizar a divisão
        if (numero2 == 0) {
            System.out.println("Não é possível fazer a divisão por zero.");
        } else {
            int divisao = numero1 / numero2;
            System.out.println("A divisão dos números é: " + divisao);
        }
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração dos números é: " + subtracao);
        System.out.println("A multiplicação dos números é: " + multiplicacao);
        
        
        


        
    }
}
