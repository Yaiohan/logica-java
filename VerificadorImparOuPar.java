import java.util.Scanner;
public class VerificadorImparOuPar {

public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println(" É par ou ímpar? ");
System.out.println(" Digite um número: ");

int numero = sc.nextInt();

if ( numero % 2 == 0){

System.out.println(" É um número par! ");

} else {

System.out.println(" É um número ímpar! ");

}
}   
}
