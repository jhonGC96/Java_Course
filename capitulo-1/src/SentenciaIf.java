import java.util.Scanner;

public class SentenciaIf {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numPensado = 5;
            // int numIntroducido = 0;
            System.out.println("Adivina el numero que estoy pensando del 1-10");
            int numIntroducido = scanner.nextInt();
            String color;
            if (numIntroducido == numPensado) {
                color = "\033[0;32m";
                System.out.println(color + "Lo adivinaste!!");
            } else {
                color = "\033[0;21m";
                System.out.println(color + "Intenta de nuevo");
            }
        }

        // do {
        // System.out.println("Adivina el numero que estoy pensando del 1-10");
        // numIntroducido = scanner.nextInt();
        // } while (numPensado != numIntroducido);

    }
}
