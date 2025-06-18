
import java.util.Scanner;

public class Boolean {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int fim = scanner.nextInt();

        System.out.print("Deseja ver números pares ou ímpares? (par/impar): ");
        String escolha = scanner.next();

        for (int i = fim; i >= inicio; i--) {
            if (escolha.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}