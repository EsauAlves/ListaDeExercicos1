import java.util.Scanner;
public class Questão3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo N: ");
        int n = scanner.nextInt();

        System.out.println("Números primos entre 2 e " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scanner.close();
    }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
