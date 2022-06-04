import java.util.Scanner;

public class ConsoleUtils {
    public static int lerInteiro(String msg) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println(msg);            
            while (true) {
                try {
                    String str = input.next();
                    int n = Integer.parseInt(str);
                    return n;
                } catch(NumberFormatException ex) {
                    System.out.println("O valor digitado não é um número inteiro válido. Tente novamente!");
                }
            }
        } finally {
            input.close();
        }
    }
}