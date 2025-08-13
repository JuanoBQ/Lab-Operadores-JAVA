import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 y 2. Ingresar edades
        System.out.print("Ingrese la edad de la primera persona: ");
        int edad1 = scanner.nextInt();

        System.out.print("Ingrese la edad de la segunda persona: ");
        int edad2 = scanner.nextInt();

        // 3. Comparaciones
        boolean ambasMayores18 = (edad1 > 18) && (edad2 > 18);
        boolean ambasMenores30 = (edad1 < 30) && (edad2 < 30);
        boolean algunaMayor50 = (edad1 > 50) || (edad2 > 50);

        // 4. Mostrar resultados
        System.out.println("¿Ambas personas son mayores de 18? " + ambasMayores18);
        System.out.println("¿Ambas personas son menores de 30? " + ambasMenores30);
        System.out.println("¿Alguna persona es mayor de 50? " + algunaMayor50);

        scanner.close();
    }
}
