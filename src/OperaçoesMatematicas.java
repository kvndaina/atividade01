import java.util.Scanner;

public class OperaçoesMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Subtração Simples===");

        System.out.println("Digite um número: ");
        int a = sc.nextInt();

        System.out.println("Digite outro número: ");
        int b = sc.nextInt();

        System.out.println("Subtração: " + (a - b));

        System.out.println("=== Multiplicação Simples===");

        System.out.println("Digite um número: ");
        int c = sc.nextInt();

        System.out.println("Digite outro número: ");
        int d = sc.nextInt();

        System.out.println("Multiplicação: " + (a * b));

        System.out.println("=== Divisão Simples===");

        System.out.println("Digite um número: ");
        int e = sc.nextInt();

        System.out.println("Digite outro número: ");
        int f = sc.nextInt();

        System.out.println("Divisão: " + (a / b));
    }
}
