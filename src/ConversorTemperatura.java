import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para converter Celsius -> Fahrenheit");
        System.out.println("Digite 2 para converter Fahrenheit -> Celsius");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.println("Em Fahrenheit: " + f);
        } else if (opcao == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double f = sc.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.println("Em Celsius: " + c);
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
