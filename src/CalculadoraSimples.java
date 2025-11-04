import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int a = sc.nextInt();

        System.out.println("Digite outro nnúmero: ");
        int b = sc.nextInt();

        sc.nextLine();

        System.out.println("Escolha uma operação entre +, -, * ou / ");
        String operacao = sc.nextLine();

        if(operacao.equals("+")) {
            System.out.println("Soma: " + (a + b));
        }
        else if(operacao.equals("-")) {
            System.out.println("Subtração: " + (a - b));
        }

        if(operacao.equals("*")) {
            System.out.println("Multiplicação: " + (a * b));
        }
        else if(operacao.equals("/")) {
            System.out.println("Divisão: " + (a / b));
        }

        sc.close();

    }


}