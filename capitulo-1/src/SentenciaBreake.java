import java.util.Scanner;

public class SentenciaBreake {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numEncontrado;
            for (numEncontrado = 2567; numEncontrado <= 3642; numEncontrado++) {
                System.out.println("Será el numero? " + numEncontrado);
                if ((numEncontrado % 2 == 0) && (numEncontrado % 3 == 0) && (numEncontrado % 5 == 0)) {
                    break;
                }
            }
        }
    }
}
