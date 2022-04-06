// Faça um programa que sorteie 6 números inteiros de 1 a 60, sem repetição, guarde em um vetor e peça ao usuário digitar um número de 1 a 100. O programa procura o número no vetor, caso exista, informa a posição do número, caso contrário, informa que o número não está no vetor.

import java.util.Random;
import java.util.Scanner;

public class loteria {

    // Atributos
    public static Scanner teclado;
    public static int[] vetor;

    // Funções e procedimentos
    public static void mega() {
        Random gerador = new Random();
        vetor = new int[6];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(60) + 1;
        }
    }

    public static int procurar(int n) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == n ) {
                return i;
            }
        }
        return -1;
    }

    // Rotina principal
    public static void main(String [] args) {
        mega();
        int acertos = 0;

        teclado = new Scanner(System.in);
        System.out.println("-- Jogo da loteria --");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número:");
        
            int num = teclado.nextInt();
            int pos = procurar(num);
            if (pos >= 0) {
                acertos++;
            } 
        }
        System.out.println("Você acertou " + acertos + " número(s)");
        if (acertos == 4) {
            System.out.println("Você  ganhou R$ 50.000,00");
        }   else    if (acertos == 5) {
                        System.out.println("Você  ganhou R$ 250.000,00");
                    }   else    if (acertos == 6) {
                                    System.out.println("Você  ganhou R$ 1,000.000,00");
                                }   else {
                                        System.out.println("Você não gannhou nada :(");
                                    }
        teclado.close(); 
    }
               
}