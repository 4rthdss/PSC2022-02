import java.util.Scanner;

public class ArthurDinizQ8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor informe sua idade: ");
        int age = scan.nextInt();

        if (age <= 7) {
            System.out.println("Sua categoria: Infantil");
        } else if (age >= 8 && age <= 10) {
            System.out.println("Sua categoria: Juvenil");
        } else if (age >= 11 && age <= 15) {
            System.out.println("Sua categoria: Adolescente");
        } else if (age >= 16 && age <= 30) {
            System.out.println("Sua categoria: Adulto");
        } else {
            System.out.println("Sua categoria: Senior");
        }
    }
}
