/*
 * El programa emila la interfaz de un cajero automatico. Presentará las siguientes opciones:
 * 
 * Elija una de las siguientes opciones:
 * Escribe 1 para consultar saldo
 * Escribe 2 para ingresar dinero
 * Escribe 3 para sacar dinero
 * Escribe 4 para consultar ultimos movimientos
 * 
 * una vez escrita la opción, pulse la tecla enter
 * Una vez el usuario ha elegido la opcion, el programa mostrará en pantalla el número correspondiente a la opción elegida
 */

import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            System.out.println("ingrese su numero de identificador");
            String identificador = scanner.nextLine();
            System.out.println("Ingrese Contraseña");
            String contraseña = scanner.nextLine();
            CajeroAutomatico cajero = new CajeroAutomatico(identificador, contraseña);

            do {
                System.out.println("Elija una de las siguientes opciones:");
                System.out.println("Escribe 1 para consultar saldo");
                System.out.println("Escribe 2 para ingresar dinero");
                System.out.println("Escribe 3 para sacar dinero");
                System.out.println("Escribe 4 para consultar ultimos movimientos");
                System.out.println("Para salir, escriba cualquier otro numero");
                System.out.println("Una vez escrita la opción, pulse la tecla enter");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case (1):
                        cajero.mostrarSaldo();
                        break;
                    case (2):
                        cajero.ingresarDinero();
                        break;
                    case (3):
                        cajero.sacarDinero();
                        break;
                    case (4):
                        cajero.consultarUltimosMovimientos();
                        break;
                    default:
                        cajero.salir();
                }
            } while (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4);
        }
    }

}
