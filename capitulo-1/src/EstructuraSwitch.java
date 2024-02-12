import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, introduzca el día que requiera su cita");
            String dia = scanner.nextLine();
            switch (dia) {
                case "Lunes":
                    System.out.println("El día lunes puede venir de 11:00 a 12:30");
                    break;
                case "Martes":
                    System.out.println("El día martes puede venir de 15:30 a 17:30");
                    break;
                case "Miercoles":
                    System.out.println("El día miercoles puede venir de 11:00 a 12:30");
                    break;
                case "Jueves":
                    System.out.println("El día miercoles puede venir de 15:30 a 17:30");
                    break;
                case "viernes":
                    System.out.println("El día viernes puede venir de 9:00 a 11:00");
                    break;
                case "Sabado":
                    System.out.println("El sabado nuestra clínica permanecerá cerrada");
                    break;
                case "Domingo":
                    System.out.println("El domingo nuestra clínica permanecerá cerrada");
                    break;
                default:
                    System.out.println("Usted no ha introducido un día válido");
                    break;
            }
        }
    }
}
