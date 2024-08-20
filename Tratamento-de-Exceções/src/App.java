import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá me chamo " + nome.toUpperCase());
        System.out.println("tenho " + idade + " anos");
        System.out.println("e minha altura é " + altura);
    }
}
