import java.util.Scanner;

public class ParImpar2 {
    public static String verificaParImpar2(int n){
        if (n % 2 == 0) {
            return "Par";
        }   else {
            return "Ímpar";
        }
}
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        do {
            n = input.nextInt();
            if (n >= 0) {
                System.out.println(verificaParImpar2(n));
            }
        } while (n >= 0); 
        input.close();
}
}
