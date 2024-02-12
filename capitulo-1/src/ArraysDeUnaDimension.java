public class ArraysDeUnaDimension {
    public static void main(String[] args) {
        String diasDelaSemana [] = new String[7];
        diasDelaSemana[0] = "lunes";
        diasDelaSemana[1] = "martes";
        diasDelaSemana[2] = "miercoles";
        diasDelaSemana[3] = "jueves";
        diasDelaSemana[4] = "viernes";
        diasDelaSemana[5] = "sabado";
        diasDelaSemana[6] = "domingo";

        System.out.println("El segundo día de la semana es: " + diasDelaSemana[1]);

        int numeros[] = {8, 9, 85, -6};

        int minimo, maximo;

        minimo = maximo = numeros[0];


        for (int i = 0; i <= numeros.length - 1; i++) {
            if (numeros[i] > maximo) maximo = numeros [i];
            if (numeros[i] < minimo) minimo = numeros [i];
        }

        System.out.println("El valor mínimo del array es " + minimo + " y es valor máximo es: " + maximo);

    }
}
