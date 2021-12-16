import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;

        do{
            System.out.println("Digite um número de 1 a 10: ");
            num = scan.nextInt();
        }while(num < 1 || num > 10);
        System.out.println("\nParabéns, você digitou um número correto!");
    }
}
