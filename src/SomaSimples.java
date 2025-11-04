import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int b = sc.nextInt();

        int soma = a + b;

        System.out.println("A soma é: " + soma);

        sc.close();
    }
}
