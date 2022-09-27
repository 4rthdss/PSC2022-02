import java.util.Scanner;

public class ArthurDinizQ12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true){
            
            System.out.println("Por favor informe um numero: ");
            int firstNumber = scan.nextInt();
            System.out.println("Por favor informe outro numero: ");
            int secondNumber = scan.nextInt();

        
            System.out.println("Qual operacao voce deseja realizar?\n1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Sair");
            int operator = scan.nextInt();

            if (operator == 1) {
                System.out.println(firstNumber + secondNumber);
            } else if (operator == 2) {
                System.out.println(firstNumber - secondNumber);
            } else if (operator == 3) {
                System.out.println(firstNumber * secondNumber);
            } else if (operator == 4) {
                System.out.println(firstNumber / secondNumber);
            } else if (operator == 5) {
                break;
            } else {
                System.out.println("Digite novamente o valor informado nao pode ser reconhecido.");
            }
        }
    }
}