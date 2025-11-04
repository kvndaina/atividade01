import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int max = 100;
        int secreto = rnd.nextInt(max) + 1;
        System.out.println("Tente adivinhar (entre 1 e " + max + "). Digite 0 para sair.");
        tentativaRec(sc, secreto);
        sc.close();
    }

    static void tentativaRec(Scanner sc, int secreto) {
        System.out.print("Seu palpite: ");
        int palpite = sc.nextInt();
        if (palpite == 0) {
            System.out.println("Jogo encerrado. O número era " + secreto);
            return;
        }
        if (palpite == secreto) {
            System.out.println("Parabéns! Você acertou!");
            return;
        } else if (palpite < secreto) {
            System.out.println("Maior!");
        } else {
            System.out.println("Menor!");
        }
        tentativaRec(sc, secreto);
    }
}
