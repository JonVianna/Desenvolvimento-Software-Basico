// faça um programa que sorteia 1k números inteiros de 1 a 100 e calcule a media, o valor max e min

import java.util.Random;

public class sorteio {
    // rotina principal
    public static void main(String[] args) {
        // chamar uma função que vai trabalhar um número aleatório 
        Random gerador = new Random();
        int maior = 0;
        int menor = 101;
        int soma = 0;
        int c = 1;
        while (c <= 1000) {
            // ler um número
            int n = 1 + gerador.nextInt(100);
            c++; // c += 1 ou c = c + 1
            soma = soma + n;

            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }

            System.out.println(n);
        }
        System.out.println("A média dos números é: " + soma / (float)1000);
        System.out.println("O maior dos números é: " + maior);
        System.out.println("O menor dos números é: " + menor);
    }
}