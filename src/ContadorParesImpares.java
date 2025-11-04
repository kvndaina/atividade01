import java.util.Scanner;

public class ContadorParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0, impares = 0;

        System.out.print("Quantos números você quer digitar? ");
        int qtd = sc.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);

        sc.close();
    }
}

