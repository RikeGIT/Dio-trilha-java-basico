import java.util.Locale;
import java.util.Scanner;



public class sobremim {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();


        System.out.println("Seu nome é: " + nome + " " + sobrenome);
        System.out.println("sua idade é: " + idade);
        System.out.println("e sua altura é: " + altura);
    }

}
