import java.util.Random;
import java.util.Scanner;

// Faça um programa que sorteie 20 números inteiros de 1 a 100, sem repetição, guarde em um vetor e peça ao usuário digitar um número de 1 a 100. O programa procura o número no vetor, caso exista, informa a posição do número, caso contrário, informa que o número não está no vetor.


public class atividade2 {

    // Atributos
    public static Scanner teclado;
    public static int[] vetor;

    // Funções e procedimentos
    public static void sortear() {
        Random gerador = new Random();
        vetor = new int[20];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(100) + 1;
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
        sortear();
        teclado = new Scanner(System.in);
        System.out.println("Digite um número:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("O número alocado na posição %d é: %d\n", i, vetor[i]);
        }
        int num = teclado.nextInt();
        int pos = procurar(num);
        if (pos >= 0) {
            System.out.printf("Número encontrado na posição de %d", pos);
        } else {
            System.out.println("Número não encontrado");
        }
        teclado.close();        
    }
}
