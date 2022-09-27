import java.util.Scanner;

public class ArthurDinizQ2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua primeira e segunda nota: ");
        Double firstGrade = scan.nextDouble();
        Double secondGrade = scan.nextDouble();

        Double average = (firstGrade + secondGrade) / 2;

        if (average >= 7) {
            System.out.println("Voce foi aprovado!");
        } else {
            System.out.println("Voce infelizmente foi reprovado.");
        }
    }
}