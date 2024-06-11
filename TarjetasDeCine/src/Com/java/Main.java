package Com.java;

import EntidadesController.TarjetaController;
import Excepciones.SaldoInsuficienteException;
import Entidades.Cliente;
import Entidades.Tarjeta;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TarjetaController tarjetaController = new TarjetaController();
        Scanner scanner = new Scanner(System.in);

        // Crea tarjetas con números aleatorios
        long numeroTarjeta1 = generarNumeroTarjetaAleatorio();
        long numeroTarjeta2 = generarNumeroTarjetaAleatorio();

        Tarjeta tarjeta1 = new Tarjeta(numeroTarjeta1, 123, LocalDate.of(2025, 12, 31), 100.0, "Activa");
        Tarjeta tarjeta2 = new Tarjeta(numeroTarjeta2, 321, LocalDate.of(2026, 6, 30), 50.0, "Activa");

        tarjetaController.agregarTarjeta(tarjeta1);
        tarjetaController.agregarTarjeta(tarjeta2);

        System.out.println("Tarjeta 1 creada con número: " + numeroTarjeta1);
        System.out.println("Tarjeta 2 creada con número: " + numeroTarjeta2);

        boolean salir = false;
        while (!salir) {
            System.out.println("1. Recargar tarjeta");
            System.out.println("2. Pagar con tarjeta");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        long numeroTarjetaRecarga = obtenerNumeroTarjeta(scanner, tarjetaController);
                        System.out.println("Ingrese el monto a recargar:");
                        double montoRecarga = scanner.nextDouble();
                        tarjetaController.recargarTarjeta(numeroTarjetaRecarga, montoRecarga);
                        System.out.println("Recarga exitosa");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        long numeroTarjetaPago = obtenerNumeroTarjeta(scanner, tarjetaController);
                        System.out.println("Ingrese el monto a pagar:");
                        double montoPago = scanner.nextDouble();
                        tarjetaController.pagarConTarjeta(numeroTarjetaPago, montoPago);
                        System.out.println("Pago exitoso");
                    } catch (IllegalArgumentException | SaldoInsuficienteException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        long numeroTarjetaConsulta = obtenerNumeroTarjeta(scanner, tarjetaController);
                        double saldo = tarjetaController.consultarSaldo(numeroTarjetaConsulta);
                        System.out.println("El saldo de la tarjeta es: " + saldo);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }

    public static long generarNumeroTarjetaAleatorio() {
        Random random = new Random();
        // Genera un número de 8 dígitos
        long numeroTarjeta = 10000000L + (long)(random.nextDouble() * 90000000L);
        return numeroTarjeta;
    }

    public static long obtenerNumeroTarjeta(Scanner scanner, TarjetaController tarjetaController) throws IllegalArgumentException {
        System.out.println("Ingrese el número de tarjeta:");
        long numeroTarjeta = scanner.nextLong();
        if (!tarjetaController.existeTarjeta(numeroTarjeta)) {
            throw new IllegalArgumentException("La tarjeta no existe");
        }
        return numeroTarjeta;
    }
}






