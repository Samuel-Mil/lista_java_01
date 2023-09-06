/*Faça um algoritmo que, lendo três números correspondentes aos coeficientes de uma
equação do 2º grau, calcule seu delta e imprima as raízes desta equação. */
import java.util.Scanner;

class exer10{
    public static void main(String args[]){
        float num=0, num2=0, num3=0, equa = 0;
        Scanner scn =  new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        num = scn.nextFloat();
        System.out.println("Digite o segundo numero: ");
        num2 = scn2.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        num3 = scn3.nextFloat();

        //x^2 + bx + c = 0
        equa = num*num + num2*num + num3;
        System.out.printf("A equacao eh: %.3f\n", equa);
        return;
    }
}