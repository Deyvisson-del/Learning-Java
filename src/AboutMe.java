import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    try {

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();


        System.out.println("\nOlá me chamo "+nome+"\nTenho "+idade+" anos\nMinha altura é "+altura+"cm");

        sc.close();
    }catch (InputMismatchException e){
        System.err.println("Os campos idade ou altura precisam ser númericos");
    }
    }
}
