import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cliente = "Angel Meléndez";
        String tipoCuenta = "Corriente";
        double saldo = 1250.99;
        int opcion = 0;

        // %s indica que se insertará una cadena en el marcador de posición, %d indica un valor entero y %f indica un valor decimal.
        System.out.println(String.format("""
                ***************************************
                *                                     *
                * Nombre del cliente: %s  *
                * Tipo de cuenta: %s           *
                * Saldo disponible: %.2f           *
                *                                     *               
                ***************************************                
                """, cliente, tipoCuenta, saldo));

        while (opcion != 9) {

            System.out.println("""
                    ** Ingrese el número de la opción deseada **
                    1 - Consultar Saldo.
                    2 - Retirar.
                    3 - Depositar.
                    9 - Salir.
                    """);

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es de $" + saldo);
                    break;

                case 2:
                    System.out.println("Ingrese la cantidad que desea retirar: ");
                    double retiro = teclado.nextDouble();

                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente");
                    }else {
                        System.out.println("Saldo actualizado: $" + (saldo - retiro));
                        saldo -= retiro;
                    }
                    break;

                case 3:
                    System.out.println("Ingrese la cantidad que desea retirar: ");
                    double deposito = teclado.nextDouble();
                    System.out.println("Saldo actualizado: $" + (saldo + deposito));
                    saldo += deposito;
                    break;

                case 9:
                    System.out.println("Saliendo del sistema... Agradecemos su preferencia, buen viaje!!");
                    break;

                default:
                    System.out.println("Lo sentimos, la opción que ingreso no es valida...");
                    break;
            }

        }
    }
}