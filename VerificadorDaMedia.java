import java.util.Scanner;

public class VerificadorDaMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua nota:");
        double nota2 = sc.nextDouble();
        double media;

        media = (nota1 + nota2) / 2;

        if (media >= 7) {

            System.out.println("Você passou!");

        } else if (media >= 5 && media < 7) {

            System.out.println("Você esta de recuperação!");
        } else {
            System.out.println(" Você foi reprovado!");
        }

    }
}