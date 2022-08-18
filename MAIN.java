public class MAIN {
    public static void main(String[] args) {

        //instanciar la clase
        Cuenta miCuenta= new Cuenta( numero "123456", tipo: "credito", valorinicial: 150000);
        System.out.println("Saldo minimo: "+miCuenta.getSaldoMinimo());
        miCuenta.consignar( monto: 80000);
        System.out.println("Saldo Actual: "+miCuenta.getSaldoActual());
        miCuenta.retirar( monto: 250000);
        System.out.println("Saldo Actual: "+miCuenta.getSaldoActual());

    }

}
