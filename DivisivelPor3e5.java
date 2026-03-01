import java.util.Scanner;
public class main10 {
    
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println(" É ou não é divisível?");
System.out.println(" Informe um número: ");

int numero = sc.nextInt();

if ( numero % 3 == 0 && numero % 5 == 0){

System.out.println(" Divisível por 3 e por 5! ");

} else if ( numero % 3 == 0 ) {

System.out.println(" Divisível apenas por 3!");

} else if ( numero % 5 == 0 ) {

System.out.println(" Divisível apenas por 5!");

} else {

System.out.println(" É divisível por nenhum!!");

}
}
}
