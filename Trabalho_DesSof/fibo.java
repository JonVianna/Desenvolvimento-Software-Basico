/*Nesse exercício, você deve fazer um programa que calcula o n-ésimo termo da sequência de Fibonacci. O programa lê o valor de n e calcula o valor de f(n). O valor de n deve ser inteiro positivo e o programa deve validar a entrada. Casos em que n = 0 ou n = 1 devem ser tratados.*/

import java.util.Scanner;

public class fibo {

    // funções e procedimentos
    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
    public static void main(String[] args) {
        System.out.println("-- Sequencia de Fibonacci --  \n Insira um número: ");
        Scanner v1 = new Scanner(System.in);
        int num = v1.nextInt();
        if (num >= 0) {
        System.out.println("A sequência de Fibonacci do número '" + num + "' é: " + fibonacci(num));            
        } else {
            System.out.println("Número negativo");
        }
    }
}
