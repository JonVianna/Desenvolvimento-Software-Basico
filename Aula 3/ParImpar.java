import java.util.Scanner;

// Faça um programa que leia os números digitados do teclado. Para cada número, o programa verifica se é par ou impar e mostra na tela.

public class ParImpar {
    public static void main(String[] args) {
            System.out.println("Insira um número ");
            Scanner input = new Scanner(System.in);
            int numero = input.nextInt();
            input.close();

            if (numero % 2 == 0) {
                System.out.println("Par");
            }   else if (numero < 0) {
                System.out.println("Número negativo");
            }   else {
                System.out.println("Ímpar");
            }
    }
}
