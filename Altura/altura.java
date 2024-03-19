import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su altura en centímetros:");
        int altura = scanner.nextInt();

        if (altura > 170) {
            System.out.println("Eres alto");
        } else {
            System.out.println("No eres alto");
        }
    }
}
