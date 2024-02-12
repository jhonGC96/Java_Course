import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
    CuentaBancaria cuentaBancariaActual;
    Scanner scanner = new Scanner(System.in);

    CajeroAutomatico(String identificador, String contraseña) {
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50000);
        cuentaBancariaActual = new CuentaBancaria("Jhon", cantidadAleatoria);
    }

    void mostrarSaldo() {
        System.out.println("Su saldo es: " + cuentaBancariaActual.obtenerSaldo());
    }

    void ingresarDinero() {
        System.out.println("¿Cuánto dinero quiere ingresar? ");
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);

    }

    void sacarDinero() {
        System.out.println("¿Cuanto dinero quiere retirar? ");
        double cantidadRetirar = scanner.nextDouble();
        cuentaBancariaActual.sacarDinero(cantidadRetirar);
    }

    void consultarUltimosMovimientos(){

    }

    void salir(){
        System.out.println("Muchas gracias por utilizar nuestros servicios");
    }
 
}
