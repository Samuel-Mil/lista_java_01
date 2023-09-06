/**
 * Ler três valores inteiros representados pelas variáveis A, B e C e apresentar os valores
lidos dispostos em ordem crescente
 */

import java.util.Scanner;

class exer11{
    public static void main(String args[]){
        float num=0, num2=0, num3=0;
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num = scn.nextFloat();
        System.out.println("Digite o segundo numero: ");
        num2 = scn2.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        num3 = scn3.nextFloat();

        if(num > num2 && num > num3){
            System.out.printf("%.2f\n", num);
            if(num2 < num && num2 > num3){
                System.out.printf("%.2f\n", num2);
                System.out.printf("%.2f\n", num3);
            }else{
                System.out.printf("%.2f\n", num3);
                System.out.printf("%.2f\n", num2);
            }
        }

        if(num2 > num && num2 > num3){
            System.out.printf("%.2f\n", num2);
            if(num < num2 && num > num3){
                System.out.printf("%.2f\n", num);
                System.out.printf("%.2f\n", num3);
            }else{
                System.out.printf("%.2f\n", num3);
                System.out.printf("%.2f\n", num);
            }
        }

        if(num3 > num && num3 > num2){
            System.out.printf("%.2f\n", num3);
            if(num < num3 && num > num2){
                System.out.printf("%.2f\n", num);
                System.out.printf("%.2f\n", num2);
            }else{
                System.out.printf("%.2f\n", num2);
                System.out.printf("%.2f\n", num);
            }
        }

        return;
    }
}