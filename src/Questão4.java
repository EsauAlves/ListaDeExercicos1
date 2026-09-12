import java.util.Scanner;
public class Questão4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número (entre 1 e 30): ");
            int num = scanner.nextInt();
            while (num < 1 || num > 30) {
                System.out.print("Número inválido! Digite um valor entre 1 e 30: ");
                num = scanner.nextInt();
            }
            numeros[i] = num;
        }

        System.out.println("\n- Diagrama de Barras -");
        for (int num : numeros) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
