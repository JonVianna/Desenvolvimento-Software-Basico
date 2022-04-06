/*Faça um jogo de adivinhação em que programa sorteia um número inteiro positivo de 0 a 100 e o jogador tem 10 tentativas (vidas) para acertar. Em cada tentativa, lê o número digitado pelo jogador e mostra uma dica. Essa dica consiste em informar se o número digitado é maior ou menor que o número sorteado. Caso o jogador acerte, o jogo termina informando que o jogador venceu, caso as vidas acabem, o jogo termina informando que o jogador perdeu. O programa deve validar o número digitado pois o valor precisa ser entre 0 e 100.*/

import java.util.Random;
import java.util.Scanner;
 
public class jogo {
 
     
    public static void main(String[] args) {
 
        Random gerador = new Random();
        int vida = 9;
         
        System.out.println("-- Jogo de adivinhação --  \n Chute um número: ");
        Scanner chute = new Scanner(System.in);

        int n = gerador.nextInt(100);
        int t1 = chute.nextInt();

            // for(int i = 0; i <= 10; i++)

                while (vida > 0) {
                    if (t1 > n) {
                        System.out.println("Errou.. o número sorteado é menor que este");
                        vida--;
                    } else  if (t1 < n) {
                            System.out.println("Errou.. o número sorteado é maior que este");
                            vida--;
                            } else {
                            System.out.println("Parabéns, você acertou!!");
                        }
                }
    }
}
