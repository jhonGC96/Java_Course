import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor introduzca el número del que quiera obtener la raíz cuadrada");
            double numero = scanner.nextDouble();
            double candidatoRaízCuadrada = 0.0;
            while (candidatoRaízCuadrada * candidatoRaízCuadrada <= numero) {
                candidatoRaízCuadrada += 0.01;
                System.out.println("Será el numero " + candidatoRaízCuadrada + " ? " + "Su cuadrado es "
                        + candidatoRaízCuadrada * candidatoRaízCuadrada);
            }
            candidatoRaízCuadrada -= 0.01;
            System.out.println("la raiz cuadrada que hemos calculado es " + candidatoRaízCuadrada);
            System.out.println("la raíz cuadrada real es " + Math.sqrt(numero));
        }

    }
}
