import java.util.Scanner;

public class main9 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println(" É múltiplos ou não? ");
System.out.println(" Insira um número: ");

int numero = sc.nextInt();

if ( numero % 4 == 0) {

System.out.println(" É múltiplo de 4 ");

} else {

System.out.println(" Não é múltiplo de 4 ");

}

}

}
