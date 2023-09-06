/*
Uma importadora importa produtos de vários países. O preço do frete varia de acordo com o
país seguindo a tabela abaixo. Faça um programa que receba o valor de um produto, o país
de origem (imprima as opções possíveis em um menu) e imprima o valor total do produto
mais frete.
*/

import java.util.Scanner;
class exer3{
    public static void main(String args[]){
        int opt = 0;
        float frete = 0;
        float preco = 0;
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        System.out.printf("Digite o preco do produto: ");
        preco = scn2.nextFloat();

        System.out.printf("Escolha um pais para a entrega do produto de %.2f!\n", preco);
        System.out.println("[1] USA"); // 60,00
        System.out.println("[2] França"); // 75,50
        System.out.println("[3] Mexico"); // 50,00
        System.out.println("[4] Argentina"); // 27,35
        System.out.println("[5] China"); // 80,00
        System.out.printf("Digite sua escolha(somente o numero): ");
        opt = scn.nextInt();

        switch(opt){
            case 1:
                frete = 60;
            break;

            case 2:
                frete = 75.50f;
            break;

            case 3:
                frete = 50.00f;
            break;

            case 4:
                frete = 27.35f;
            break;

            case 5:
                frete = 80;
            break;

            default:
                System.out.println("Valor invalido!");
            break;
        }

        preco = preco + frete;

        System.out.printf("O produto com o frete ficou R$%.2f", preco);

        return;
    }
}