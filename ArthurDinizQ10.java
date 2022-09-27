import java.util.Scanner;

public class ArthurDinizQ10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, entre 1 e 7, informe um numero: ");
        int dayWeek = scan.nextInt();

        switch (dayWeek) {
            case 1 :
            System.out.println("Este numero corresponde a: Domingo");
            break;
            case 2 :
            System.out.println("Este numero corresponde a: Segunda-feira");
            break;
            case 3 :
            System.out.println("Este numero corresponde a: Terca-feira");
            break;
            case 4 :
            System.out.println("Este numero corresponde a: Quarta-feira");
            break;
            case 5 :
            System.out.println("Este numero corresponde a: Quinta-feira");
            break;
            case 6 :
            System.out.println("Este numero corresponde a: Sexta-feira");
            break;
            case 7 :
            System.out.println("Este numero corresponde a: Sabado");
            break;
            default :
            System.out.println("O numero informado nao esta entre 1 e 7.");
            break; 

        }
    }
}
