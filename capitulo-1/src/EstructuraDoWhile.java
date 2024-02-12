import java.util.Scanner;

public class EstructuraDoWhile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        double numero;
        do {
            System.out.println("introduzca un numero y le mostraremos la raíz cuadrada, para salir introduzca el 0");
            numero = scanner.nextDouble();
            if (numero == 0) {
                System.out.println("Adios!");
            } else {
                System.out.println("la raiz cuadrada de " + numero + " es " + Math.sqrt(numero));
            }
        } while (numero != 0);
    }
    }
}
