/**
 * Implemente um programa que leia o código do item pedido, a quantidade e calcule o valor a
ser pago por aquele lanche. Considere que a cada execução somente será calculado um
item.
 */
import java.util.Scanner;
class exer4{
    public static void main(String args[]){
        int opt;
        int quant = 0;
        float preco = 0;
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        System.out.println("Escolha um lanche: ");
        System.out.println("[100] Cachorro Quente R$1.20.");
        System.out.println("[101] Bauru simples.  R$1.30");
        System.out.println("[102] Bauru com ovo.  R$1.50");
        System.out.println("[103] Hamburguer.     R$1.20");
        System.out.println("[104] Cheeseburguer.  R$1.30");
        System.out.println("[105] Refrigerante.   R$1.00");
        System.out.println("Digite o codigo(somente numeros): ");
        opt = scn.nextInt();

        if(opt > 105 || opt < 100){
            System.out.println("Valor invalido!");
            return;
        }

        switch(opt){
            case 100:
                preco = 1.20f;
            break;

            case 101:
                preco = 1.30f;
            break;

            case 102:
                preco = 1.50f;
            break;

            case 103:
                preco = 1.20f;
            break; 

            case 104:
                preco = 1.30f;
            break;

            case 105:
                preco = 1.00f;
            break;
        }

        System.out.println("Qual a quantidade que voce quer: ");
        quant = scn2.nextInt();
        preco = preco * quant;
        
        System.out.printf("Seu lanche ficou: R$%.2f\n", preco);
    }
}