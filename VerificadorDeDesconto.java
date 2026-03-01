import java.util.Scanner;

public class VerificadorDeDesconto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lojinha da Vitórinha!");

        System.out.println(" Informe o valor do produto:");

        double produto = sc.nextDouble();
        double desconto;

        if (produto > 1000) {
            System.out.println("O produto está com 15% de desconto!");
            desconto = produto * 15 / 100;
            produto = produto - desconto;
            System.out.println(" O valor do desconto " + desconto);
            System.out.println(" O valor do produto com desconto é" + produto);
        } else if (produto < 1000) {
            System.out.println(" O produto está com 8% de desconto!");
            desconto = produto * 8 / 100;
            produto = produto - desconto;
            System.out.println(" O valor do desconto é de " + desconto);
            System.out.println(" O valor do produto com desconto é " + produto);

        }

    }

}
