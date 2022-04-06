/* >> Criar uma classe Calculadora com os métodos soma, subtração, multiplicação e divisão. Siga as instruções:
• Cada método deve receber dois inteiros e retornar o resultado: public static int operacao(int a, int b).
• No método main, fazer uma chamada a cada um dos métodos desenvolvidos e apresentar o resultado na tela.
• Use o comando System.out.println(...) para mostrar o resultado na tela. */


import java.util.Scanner;

public class calculadora{

    // métodos
    public static int somar (int v1, int v2){
        return v1 + v2;
    }

    public static int subtrair (int v1, int v2){
        return v1 - v2;
    }

    public static int multiplicar (int v1, int v2){
        return v1 * v2;
    }

    public static int dividir (int v1, int v2){
        return v1 / v2;
    }

    // rotina principal
    public static void main (String args[]){
        int v1;
        int v2;
        int operacao;

        System.out.println("-- Cálculo --  \n Escolha qual operação você deseja realizar: \n 1. para soma \n 2. para subtração  \n 3. para multiplicação  \n 4. para divisão");
        Scanner input = new Scanner(System.in);
        operacao = input.nextInt();

        if (operacao == 1) {
	    		System.out.println("Qual o primeiro numero: ");
	    		 v1 = input.nextInt();
	    		System.out.println("Qual o segundo numero: ");
	    		 v2 = input.nextInt();
                System.out.println("A soma dos números resulta em: "+ somar(v1, v2));
        }

        if (operacao == 2) {
            System.out.println("Qual o primeiro numero: ");
             v1 = input.nextInt();
            System.out.println("Qual o segundo numero: ");
             v2 = input.nextInt();
            System.out.println("A subtração dos números resulta em: "+ subtrair(v1, v2));
        }

        if (operacao == 3) {
            System.out.println("Qual o primeiro numero: ");
             v1 = input.nextInt();
            System.out.println("Qual o segundo numero: ");
             v2 = input.nextInt();
            System.out.println("A multiplicação dos números resulta em: "+ multiplicar(v1, v2));
        }

        if (operacao == 4) {
            System.out.println("Qual o primeiro numero: ");
             v1 = input.nextInt();
            System.out.println("Qual o segundo numero: ");
             v2 = input.nextInt();
            System.out.println("A divisão dos números resulta em: "+ dividir(v1, v2));
        }
        else {
            System.out.println("Valor incorreto");
        }
    }
}

