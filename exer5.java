/**Preparar um algoritmo que leia um número inteiro e descubra se é par ou ímpar. */
import java.util.Scanner;
class exer5{
    public static void main(String args[]){
        int num;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        num = scn.nextInt();

        if((num % 2) == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }

        return;
    }
}