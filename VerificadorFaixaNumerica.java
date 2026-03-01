import java.util.Scanner;

public class main8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
System.out.println(" Sistema ");
System.out.println(" Insira um número" );

int numero = sc.nextInt();

if (numero >= 1 && numero <= 10) {

System.out.println(" Este número está entre 1 e 10 ");

} else if ( numero >= 11 && numero <= 20) {

System.out.println(" Este número está entre 11 e 20" );

} else if ( numero > 20 ){

System.out.println(" O número informado é maior que 20");

} else {

System.out.println(" Número inválido!");

}
}   
}
