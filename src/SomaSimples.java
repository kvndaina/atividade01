import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        System.out.println("=== SOMA SIMPLES===");

        Scanner sc = new  Scanner(System.in);

        System.out.println("Digite um número: ");
        int a = sc.nextInt();

        System.out.println("Digite outro número: ");
        int b = sc.nextInt();

        System.out.println("Soma: " + (a + b));
    }
}
