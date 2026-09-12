 Questão 5: 

- Scanner: É uma classe do Java usada para ler dados digitados pelo usuário no console. Métodos como exemplo `nextDouble()`, `nextInt()` ou `nextLine()` são usados para capturar diferentes tipos de entradas.
- System.out.printf: É um método usado para imprimir texto formatado. O especificador `%.2f` permite formatar um número do tipo `double` exibindo apenas 2 casas decimais.

Exemplo:
```java
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();
        
        System.out.printf("Valor formatado com 2 casas: %.2f\n", valor);
        sc.close();
    }
}
```

Questão 6:

- O parâmetro **String** args deve ser uma array **(String[] args)**.
- O **while (contador <= 5)** não possuía um incremento **contador++**, fazendo com que a condição fosse sempre verdadeira gerando um loop infinito.
- Erro de sintaxe, **System.out.println()** está sem ponto e vírgula no final.

código corrigido:
```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        sc.close();
    }
}
```
