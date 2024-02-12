import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double valorDolar = 1.05; 
            System.out.println("Bienvenido al conversor de moneda");
            System.out.println("Ingrese cantidad de euros a convertir: ");
            double cantidadEuros = scanner.nextInt();
            double resultadoDolares = cantidadEuros * valorDolar;
            System.out.println(cantidadEuros + " euros equivale a:  " + resultadoDolares + " dolares");

            String eurosString = Double.toString(cantidadEuros);
            BigDecimal eurosBigDecimal = new BigDecimal(eurosString);
            String valorDolarString = Double.toString(valorDolar);
            BigDecimal valorDolarBigDecimal = new BigDecimal (valorDolarString);

            BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(valorDolarBigDecimal);
            System.out.println(cantidadEuros + " euros equivale a: " + dolaresBigDecimal.toString() + " US dolares");
        }

    }
}
