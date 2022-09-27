import java.util.Scanner;
import java.math.*;

public class ArthurDinizQ122 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculador equacoes do 2 grau:\nInforme o valor de a:");
        int a = scan.nextInt();
        System.out.println("Informe o valor de b:");
        int b = scan.nextInt();
        System.out.println("Informe o valor de c:");
        int c = scan.nextInt();

        int delta = (a * a) - 4 * a * c;
        int x1;
        int x2;
        
        if (delta < 0 ) {
            System.out.println("Delta: " + delta);
            System.out.println("Nao existe raiz real.");
        } else if (delta == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("Delta: " + delta);
            System.out.println("x: " + x1);
        } else {
            x1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Delta: " + delta);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);              
        }
    }
}
