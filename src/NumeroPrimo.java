import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println(n + " não é primo.");
        } else {
            boolean primo = ehPrimoRec(n, 2);
            System.out.println(n + (primo ? " é primo." : " não é primo."));
        }
        sc.close();
    }

    static boolean ehPrimoRec(int n, int i) {
        if (i * i > n) return true;
        if (n % i == 0) return false;
        return ehPrimoRec(n, i + 1);
    }
}

