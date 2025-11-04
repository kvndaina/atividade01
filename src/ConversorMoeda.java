import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double taxaDolar = 5.0;
        double taxaEuro = 5.5;

        System.out.print("Digite o valor em reais: ");
        double reais = sc.nextDouble();

        System.out.print("Converter para (1) Dólar ou (2) Euro? ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Valor em Dólares: " + (reais / taxaDolar));
        } else if (opcao == 2) {
            System.out.println("Valor em Euros: " + (reais / taxaEuro));
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}

