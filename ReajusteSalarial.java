import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe o seu salário:");

        double salario = sc.nextDouble();

        double aumentoSalario;

        if (salario < 1500) {
            System.out.println(" Aumento de 15%! ");
            aumentoSalario = salario + (salario * 15 / 100);
            System.out.println(" Seu salário alterou para " + aumentoSalario);

        } else if (salario <= 3000) {
            System.out.println(" Aumento de 10%! ");
            aumentoSalario = salario + (salario * 10 / 100);
            System.out.println(" Seu salário aumentou para " + aumentoSalario);

        } else {

            System.out.println(" Aumento de 5%! ");
            aumentoSalario = salario + (salario * 5 / 100);
            System.out.println(" Seu salário aumentou para " + aumentoSalario);
        }

    }

}
