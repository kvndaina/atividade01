import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número N: ");
        int n = sc.nextInt();
        contagemRec(n);
        sc.close();
    }

    static void contagemRec(int n) {
        if (n < 0) return;
        System.out.println(n);
        contagemRec(n - 1);
    }
}
