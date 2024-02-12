import java.util.Scanner;

public class OperadorInterrogante {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce un numero entero");
            int dividendo = scanner.nextInt();
            System.out.println("Introduce otro numero");
            int divisor = scanner.nextInt();
            int result;
            // if (divisor < 1) {
            //     result = 0;
            // } else {
            //     result = dividendo / divisor;
            // }
            result = divisor == 0?0:dividendo/divisor;
            System.out.println("El resultado de dividir " + dividendo + " entre " + divisor + " es " + result);
        }
    }
}
