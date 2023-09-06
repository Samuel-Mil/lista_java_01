/**
 * Faça um programa, usando o comando switch, em que receba um número de 1 a 7 e
devolva o dia da semana.
 */
import java.util.Scanner;

class exer2{
    public static void main(String args[]){
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7");
        num = scn.nextInt();

        if(num > 7 || num < 1){
            System.out.println("Valor invalido!");
            return;
        }

        // Pra mim o primeiro dia da semana eh o domingo mas me chamaram de louco
        switch(num){
            case 1:
                System.out.println("Segunda");
            break;

            case 2:
                System.out.println("Terça");
            break;

            case 3:
                System.out.println("Quarta");
            break;

            case 4:
                System.out.println("Quinta");
            break;

            case 5:
                System.out.println("Sexta");
            break;

            case 6:
                System.out.println("Sabado");
            break;

            case 7:
                System.out.println("Domingo");
            break;
        }

        System.out.println("Fim");
        return;
    }
}