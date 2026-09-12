import java.util.Scanner;
public class Questão1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String name = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + (n3 * 2)) / 4.0;

        System.out.printf("Aluno: %s | Média: %.2f - ", name, media);
            if(media >= 7.0){
                System.out.println("Aprovado");
            }
            else{
                System.out.println("Reprovado");
            }
    }
}
