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

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        if (edad > 30) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres joven");
