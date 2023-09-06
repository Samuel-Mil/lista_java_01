/**
 * Usando o comando switch, escreva um programa que leia um inteiro entre 1 e 12 e
imprima o mês correspondente a este número. Isto é, janeiro se 1, fevereiro se 2 e
assim por diante.
 */
import java.util.Scanner;

class exer1{
    public static void main(String args[]){
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 12");
        num = scn.nextInt();

        if(num > 12 || num < 1){
            System.out.println("Valor invalido!");
            return;
        }

        switch(num){
            case 1:
                System.out.println("Janeiro");
            break;

            case 2:
                System.out.println("Fevereiro");
            break;

            case 3:
                System.out.println("Março");
            break;

            case 4:
                System.out.println("Abril");
            break;

            case 5:
                System.out.println("Maio");
            break;

            case 6:
                System.out.println("Junho");
            break;

            case 7:
                System.out.println("Julho");
            break;

            case 8:
                System.out.println("Agosto");
            break;

            case 9:
                System.out.println("Stembro");
            break;

            case 10:
                System.out.println("Outubro");
            break;

            case 11:
                System.out.println("Novembro");
            break;

            case 12:
                System.out.println("Dezembro");
            break;
        }
        
        System.out.println("Fim!");
        return;
    }
}
