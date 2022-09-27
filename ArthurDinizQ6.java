import java.util.Locale;
import java.util.Scanner;

public class ArthurDinizQ6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);;

        System.out.println("Por favor informe seu sexo: [M = 0 / F = 1]");
        int sex = scan.nextInt();
        System.out.println("Agora informe sua altura: ");
        Double height = scan.nextDouble();
        Double weight = 0.00;

        if (sex == 0) {
            weight = (72.702 * height) - 58;
        } else {
            weight = (62.10 * height) - 44.7;
        }
        
        String result = String.format("%.2f", weight);
        System.out.println("O seu peso ideal é " + result);
    }
}