import java.util.Scanner;

public class Main4 {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Informe um número:");

        int numero = sc.nextInt();

        if (numero > 0){

            System.out.println(" O número e positivo!!");
     
        } else if ( numero < 0) {
            System.out.println(" O número é negativo!");

        } else {
            System.out.println(" O número  é zero! ");
        }

    }
}
