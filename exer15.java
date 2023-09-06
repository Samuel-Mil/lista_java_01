/**
 * Efetuar a leitura de três valores inteiros desconhecidos representados pelas variáveis A, B e
C. Somar os valores fornecidos e apresentar o resultado somente se for maior ou igual a
100.
 */

 import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) {
        int A,B,C, soma;
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        A = scn.nextInt();

        System.out.println("Digite o valor de B: ");
        B = scn.nextInt();

        System.out.println("Digite o valor de C: ");
        C = scn.nextInt();

        soma = A + B + C;

        System.out.printf("O soma eh igual: %d", soma);
    }
}