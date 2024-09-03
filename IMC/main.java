import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
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
    }
}    
        
       