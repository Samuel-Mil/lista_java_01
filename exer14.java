/**
 * Ler um número inteiro qualquer e multiplicá-lo por dois. Apresentar o resultado da
multiplicação somente se o resultado for maior que 30.
 */

import java.util.Scanner;

public class exer14 {
    public static void main(String[] args) {
        int num, mult;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        num = scn.nextInt();

        mult = num*2;
        System.out.printf("%d * 2 = %d", num, mult);
    }
}