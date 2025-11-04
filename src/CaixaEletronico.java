import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor a sacar (multiplo de 5): ");
        int valor = sc.nextInt();

        int notas100 = valor / 100;
        int r = valor % 100;

        int notas50 = r / 50;
        r = r % 50;

        int notas20 = r / 20;
        r = r % 20;

        int notas10 = r / 10;
        r = r % 10;

        int notas5 = r / 5;
        r = r % 5;

        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);
        if (r != 0) System.out.println("Restante não sacável: " + r);

        sc.close();
    }
}
