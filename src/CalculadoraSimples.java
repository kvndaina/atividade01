import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int a = sc.nextInt();

        System.out.println("Digite outro número: ");
        int b = sc.nextInt();

        System.out.println("Escolha  uma operação entre +, -, * ou /: ");
        String operaçao = sc.nextLine();

        if(operaçao == "+"){
            System.out.println("Soma: " + (a + b));
        }
        else if(operaçao == "-"){
            System.out.println("Subtração: " + (a - b));
        }

        if


    }
}
