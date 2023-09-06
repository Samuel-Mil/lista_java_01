/**
 * Fazer a leitura de quatro valores numéricos inteiros representados pelas variáveis A, B, C e
D. Apresentar apenas os valores que sejam divisíveis por 2 e 3.
 */

import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) {
        int A,B,C,D;
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        A = scn.nextInt();

        System.out.println("Digite o valor de B: ");
        B = scn.nextInt();

        System.out.println("Digite o valor de C: ");
        C = scn.nextInt();

        System.out.println("Digite o valor de D: ");
        D = scn.nextInt();

        System.out.println("Valores divisíveis por 2 e 3:");

        if (A % 2 == 0 && A % 3 == 0) {
            System.out.println("A: " + A);
        }

        if (B % 2 == 0 && B % 3 == 0) {
            System.out.println("B: " + B);
        }

        if (C % 2 == 0 && C % 3 == 0) {
            System.out.println("C: " + C);
        }

        if (D % 2 == 0 && D % 3 == 0) {
            System.out.println("D: " + D);
        }

    }
}
