import java.util.Scanner;

public class SomaAteN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número N: ");
        int n = sc.nextInt();

        int soma = (n * (n + 1)) / 2;

        System.out.println("A soma de 1 até " + n + " é: " + soma);

        sc.close();
    }
}
