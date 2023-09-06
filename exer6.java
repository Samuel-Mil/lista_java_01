/**
 * Faça um algoritmo que leia três números, descubra e imprima o valor maior de todos.
 */
import java.util.Scanner;

class exer6{
    public static void main(String args[]){
        float num=0, num2=0, num3=0;
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);

        
        System.out.println("Digite o primeiro numero: ");
        num = scn.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = scn2.nextInt();
        System.out.println("Digite o terceiro numero: ");
        num3 = scn3.nextInt();

        if(num > num2 && num > num3){
            System.out.printf("O maior eh %.2f", num);
        }else if(num2 > num && num2 > num3){
            System.out.printf("O maior eh %.2f", num2);
        }else if(num3 > num && num3 > num2){
            System.out.printf("O maior eh %.2f", num3);
        }
    }
}