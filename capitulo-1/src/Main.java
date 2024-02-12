public class Main {
    public static void main(String[] args) {
        // CuentaBancaria cuentaDeJuan = new CuentaBancaria();
        // cuentaDeJuan.titular="Juan Martinez";
        // cuentaDeJuan.tipoDeCuenta="nómina";
        // cuentaDeJuan.saldo=23500;

        // cuentaDeJuan.sacarDinero(500);
        // System.out.println("Ahora la cuenta de juan tiene: " + cuentaDeJuan.saldo);

        // cuentaDeJuan.ingresarDinero((1000));

        // System.out.println("Después de ingresar dinero cuenta de juan tiene: " + cuentaDeJuan.saldo);

        // cuentaDeJuan.cambiarTipoDeCuenta("Ahorro");
        // System.out.println("Ahora la cuenta es del tipo: " + cuentaDeJuan.tipoDeCuenta);

        // double saldo = cuentaDeJuan.obtenerSaldo();
        // System.out.println("El saldo de juan es: " + saldo);

        // Calculadora calculadora = new Calculadora();
        // double radio = 4.0;
        // double area = calculadora.calcularAreaCirculo(radio);
        // System.out.println("El area de un circulo de radio: " + radio + " es de: " + area);

        // System.out.println("El volumen de un prisma de 5x4x8 es: " + calculadora.calcularVolumenPrismaRectangular(5, 4, 8));

        // calculadora.calcularMedia(2.6, 2, 5.9, 8);

        CuentaBancaria cuentaDeMaria = new CuentaBancaria("Maria Perez", TipoDeCuenta.AHORRO, 25_000);
        System.out.println("mostrar tipo de cuenta: " + cuentaDeMaria.tipoDeCuenta);
        cuentaDeMaria.sacarDinero(5000);
        System.out.println("Saldo: " + cuentaDeMaria.saldo);

    }
}
