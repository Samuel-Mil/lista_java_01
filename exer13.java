/*
 * Fazer a leitura de um valor numérico inteiro qualquer e apresentá-lo caso não seja maior
que 3. Dica: para a solução deste problema utilize apenas o operador lógico de negação
 */

import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) {
        int num;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        num = scn.nextInt();

        if(num > 3){
            System.out.println("Maior que 3");
        }else{
            System.out.println("Menor que 3");
        }
    }
}