public class PasoPorReferencia {
    public static void main(String[] args) {
        int variable = 23;
        int variable2 = variable;
        System.out.println("El valor de variable es " + variable);
        System.out.println("El valor de variable 2 es: " + variable2);

        variable2 = 78;

        System.out.println("El valor de variable es " + variable);
        System.out.println("El valor de variable 2 es: " + variable2);

        CuentaBancaria cuentaDeJuan = new CuentaBancaria();

        cuentaDeJuan.saldo = 23_500;

        CuentaBancaria cuentaDeAna = cuentaDeJuan;
        cuentaDeAna.saldo = 10_000;

        System.out.println("Saldo de juan: " + cuentaDeJuan.saldo);
        System.out.println("Cuenta de ana: " + cuentaDeAna.saldo);

    }
}
