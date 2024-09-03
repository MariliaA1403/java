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
        
        
        
        // Segunda questão
        System.out.print("Digite seu peso (em kg): ");
        double peso = leia.nextDouble();
        
        System.out.print("Digite sua altura (em metros): ");
        double altura = leia.nextDouble();
        
        double IMC = peso / (altura * altura); 
        
        // Verificar a faixa do IMC
        if (IMC >= 18.50 && IMC <= 24.99) {
            System.out.println("Você está com o peso normal.");
        } else if (IMC >= 25 && IMC <= 29.99) {
            System.out.println("Você está com sobrepeso.");
        } else if (IMC >= 30 && IMC <= 34.99){
            System.out.println("Você está com obesidade grau 1");
        } else if (IMC >= 35 && IMC <= 39.99){
            System.out.println("Você está com obesidade grau 2");
        }
        
        
        //terceira questão
        
        
        
    }
}
