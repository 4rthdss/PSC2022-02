import java.util.Scanner;

public class ArthurDinizQ4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 valores para checar a condicao de existencia de um triangulo:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        if (x + y > z || y + z > x || z + x > y) {
            System.out.println("Com esses valores e possivel formar um triangulo.");
        } else {
            System.out.println("Com esses valores e impossivel formar um triangulo.");
        }
    }
}
/*| b - c | < a < b + c  */