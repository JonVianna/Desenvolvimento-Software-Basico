// System.out.printf("%d x %d =", i, j, i * j);
// System.out.printf("O valor é %d, num");
// System.out.printf("Primeiro número é %d, o segundo é %d, ...." primeiro, segundo, ....)
// %d = inteiro, %f = float ou double, %c = char, %t = datetime, %s = string

// Faça um programa que mostre na tela a tabuada completa dos números de 1 a 10 

public class aula4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
            for (int j = 1; j <= 10; j++)
                System.out.printf("%d x %d = %d \n", i, j, i * j);
    }
}

