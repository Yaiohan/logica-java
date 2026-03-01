import java.util.Scanner;
public class main11 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
System.out.println(" Meu programa! ");
System.out.println(" Informe um número: ");

int numero = sc.nextInt();

if ( numero >= 1 && numero <= 50 ) {

System.out.println(" Entre 1 e 50! ");

} else if ( numero >= 50 && numero % 2 == 0 ){

System.out.println(" Maior que 50 e múltiplo de 2!" );

} else if ( numero > 50 && numero % 2 == 1 ){

System.out.println(" Maior que 50 e não é multiplo de 2!");

} else {

System.out.println(" Número inválido! ");

        }
    }   
}
