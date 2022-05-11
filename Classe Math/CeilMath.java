import java.util.Scanner;

public class CeilMath {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Arredondando o valor para cima");

        System.out.print("Digite um número: ");
        double num = entrada.nextDouble();
        
        System.out.println("O valor arredondado para cima é: " + Math.ceil(num));
    }
    
    
}
