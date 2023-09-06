/**Dados três números representando os lados de um possível triângulo, calcule e descubra se
este triângulo é: escaleno, isóscele ou equilátero. Não se esqueça da condição de existência
do triângulo: caso não seja possível formar um triângulo, o algoritmo deve imprimir a frase
"Não é um triângulo". */
import java.util.Scanner;

class exer8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        
        System.out.println("Digite o comprimento do primeiro lado do triângulo: ");
        double lado1 = input.nextDouble();
        
        System.out.println("Digite o comprimento do segundo lado do triângulo: ");
        double lado2 = input2.nextDouble();
        
        System.out.println("Digite o comprimento do terceiro lado do triângulo: ");
        double lado3 = input3.nextDouble();
        
        if(isTriangulo(lado1, lado2, lado3)) {
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("É um triângulo equilátero.");
            }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo isósceles.");
            }else{
                System.out.println("É um triângulo escaleno.");
            }
        }else{
            System.out.println("Não é um triângulo.");
        }
    }
    
    public static boolean isTriangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}
