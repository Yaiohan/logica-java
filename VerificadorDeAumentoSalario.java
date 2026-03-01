import java.util.Scanner;

public class VerificadorDeAumentoSalario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema RH.");

        System.out.println("Informe o seu salário:");

        double salario = sc.nextDouble();

        if (salario < 2000) {
            System.out.println("Aumentou 10%!");
            salario = salario + (salario * 10 / 100);
            System.out.println("Seu salário aumentou para:" + salario);

        } else if (salario > 2000) {
            System.out.println("Aumentou 5%!");
            salario = salario + (salario * 5 / 100);
            System.out.println("Seu salário aumentou para" + salario);
        }
    }
}
