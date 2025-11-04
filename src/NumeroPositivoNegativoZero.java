import java.util.Scanner;

public class NumeroPositivoNegativoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Número positivo");
        } else if (n < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}

