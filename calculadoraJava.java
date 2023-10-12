import java.util.Scanner;
import java.lang.Math;

public class calculadoraJava {
    public static void main(String[] args) {
        int op, escolha = 0;

        do {
            menuPrincipal();
            System.out.println("Digite sua opção: ");
            Scanner opcao = new Scanner(System.in);
            op = opcao.nextInt();
            operacoes(op);
            System.out.println("Deseja continuar? (Sim = 1 / Não = 0)");
            escolha = opcao.nextInt();
        } while (escolha == 1);
    }

    public static void msgRetorno() {
        System.out.println("<<OK>>");
    }

    public static void menuPrincipal() {
        System.out.println("Bem-Vindo a calculadora");
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("5- Raiz Quadrada");
        System.out.println("6- Potenciação Quadrada");
    }

    public static void operacoes(int op) {
        double num1 = 0, num2 = 0;
        Scanner num = new Scanner(System.in);

        if ((op > 0) && (op < 5)) {
            System.out.println("Digite o primeiro número: ");
            num1 = num.nextDouble();
            System.out.println("Digite o segundo número: ");
            num2 = num.nextDouble();
        } else {

            if ((op == 5) || (op == 6)) {
                System.out.println("Digite um número: ");
                num1 = num.nextDouble();
            }
        }

        switch (op) {
            case 1:
                System.out.println("A soma é: " + (num1 + num2));
                msgRetorno();
                break;

            case 2:
                System.out.println("A subtração é: " + (num1 - num2));
                msgRetorno();
                break;

            case 3:
                System.out.println("A multiplicação é: " + (num1 * num2));
                msgRetorno();
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero!");
                } else {
                    System.out.println("A divisão é: " + (num1 / num2));
                    msgRetorno();
                }
                break;

            case 5:
                System.out.println("A sua raiz quadrada é: " + (Math.sqrt(num1)));
                msgRetorno();
                break;

            case 6:
                System.out.println("Seu quadrado é: " + (Math.pow(num1, 2)));
                msgRetorno();
                break;

            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
}
