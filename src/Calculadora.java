import javax.swing.*;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        int soma;
        int subtracao;
        int multiplicacao;
        double divisao;

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;

        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + subtracao);
        System.out.println("A multiplicação é: " + multiplicacao);
        System.out.println("A divisão é: " + divisao);
        sc.close();

    }
}