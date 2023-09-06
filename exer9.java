/*Elaborar um algoritmo que calcule a sua média nesta disciplina e imprima a média
calculada e a mensagem: "Aprovado" ou "Exame" ou "Reprovado". */
import java.util.Scanner;

class exer9{
    public static void main(String args[]){
        float num=0, num2=0, num3=0, num4=0, media;
        Scanner scn =  new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        num = scn.nextFloat();
        System.out.println("Digite a segunda nota: ");
        num2 = scn2.nextFloat();
        System.out.println("Digite a terceira nota: ");
        num3 = scn3.nextFloat();
        System.out.println("Digite a quarta nota: ");
        num3 = scn3.nextFloat();

        media = (num + num2 + num3 + num4) / 4;

        if(media >= 5){
            System.out.println("Aprovado");
        }else if(media >= 3 && media < 5){
            System.out.println("Exame");
        }else{
            System.out.println("Reprovado");
        }

        System.out.printf("Com media %.2f", media);
    }
}