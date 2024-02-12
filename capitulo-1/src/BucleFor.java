import java.util.Scanner;

public class BucleFor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor introduzca el primer número");
            int primerOperando = scanner.nextInt();
            System.out.println("Por favor introduzca el segundo numero");
            int segundoOperando = scanner.nextInt();
            int result = 0;
            for (int i = 0; i < segundoOperando; i++) {
                System.out.println("iteracion numero; " + i);
                result = result + primerOperando;
            }
            System.out.println("El resultado de multiplicar " + primerOperando + " por " + segundoOperando + " es igual a: " + result);
        }
    }
}
