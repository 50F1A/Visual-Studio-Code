import java.util.Scanner;

public class AbsMath {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Valor absoluto do número");

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();
        
        System.out.println("O valor absoluto do número é: " + Math.abs(num));
    }
    
}