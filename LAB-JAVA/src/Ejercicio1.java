import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        int imcEntero = (int) imc;

        System.out.println("Tu IMC (con decimales) es: " + imc);
        System.out.println("Tu IMC (solo parte entera) es: " + imcEntero);

        scanner.close();
    }
}
