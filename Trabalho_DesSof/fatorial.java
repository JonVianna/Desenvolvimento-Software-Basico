/* >> Faça um programa que calcule o fatorial de um número inteiro informado pelo usuário. Validar a entrada pois o número precisa ser positivo.*/

import java.util.Scanner;

public class fatorial {

    public static void main(String[] args) {
        int n;
        int i;
        int fat = 1;

        System.out.println("-- Cálculo de fatorial --  \n Digite um inteiro não-negativo");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        if (n < 0) {
            System.out.printf("Valor negativo");
        }
        else {  for (i = n; i > 1; i--) {
                    fat = fat * i;
                }
                System.out.printf("O valor de %d fatorial é = %d", n, fat);
        }
        
    }
}