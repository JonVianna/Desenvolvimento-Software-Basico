public class ProgramaPrincipal {
    public static void main(String[] args) {
        int num = ConsoleUtils.lerInteiro("Digite um número inteiro:");
        try {
            long fat = Fatorial.calcular(num);
            System.out.printf("%d! = %d", num, fat);
        } catch(IllegalArgumentException ex) {
            //ex.printStackTrace(); // mostra toda a pilha de chamadas
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("\nPrograma terminado. Volte sempre!");
        }
    }
}
