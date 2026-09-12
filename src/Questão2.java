import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        boolean div3 = (number % 3 == 0);
        boolean div5 = (number % 5 == 0);

        if(div3 && div5){
            System.out.printf("O número %d é múltiplo de 3 e 5", number);
        } else if(div3){
            System.out.printf("O número %d é múltiplo de 3", number);
        } else if (div5) {
            System.out.printf("o número %d é múltiplo de 5", number);
        } else{
            System.out.printf("O número %d não é múltiplo de 3 e nem de 5", number);
        }
        scanner.close();
    }
}
