package com.federicolazarte.app;

import com.federicolazarte.model.Moneda;
import com.federicolazarte.model.MonedaRecord;
import com.federicolazarte.service.MonedaService;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    private static final Set<String> MONEDAS_VALIDAS = new HashSet<>(Arrays.asList("ARS", "USD", "EUR")); // Lista de monedas válidas

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonedaService servicio = new MonedaService();

        String[] tipoMonedas = {"ARS", "USD", "EUR"};
        boolean continuar = true;
        while (continuar) {
            System.out.printf("""
                    Ingrese el valor el tipo de moneda base:
                    1. %s
                    2. %s
                    3. %s
                    4. Salir
                    """, tipoMonedas[0], tipoMonedas[1], tipoMonedas[2]);

            System.out.print("Selecciona una opción (1-4): ");
            int opcion = scanner.nextInt();
            if (opcion == 4) {
                System.out.println("Saliendo...");
                continuar = false;
                continue;
            }
            if (opcion < 1 || opcion > 3) {
                System.out.println("Opción inválida. Por favor, selecciona una opción entre 1 y 4.");
                continue;
            }
            String monedaInicial = tipoMonedas[opcion - 1];
            System.out.print("Ingrese la moneda a convertir (ej. USD, ARS, EUR): ");
            String monedaAConvertir = scanner.next().toUpperCase();
            if (!MONEDAS_VALIDAS.contains(monedaAConvertir)) {
                System.out.println("Moneda de conversión inválida. Las monedas válidas son: ARS, USD, EUR.");
                continue;
            }
            System.out.print("Ingrese el monto a convertir: ");
            double monto = scanner.nextDouble();
            if (monto <= 0) {
                System.out.println("El monto debe ser un valor positivo.");
                continue;
            }
            try {
                MonedaRecord record = servicio.getConversionRate(monedaInicial, monedaAConvertir);
                Moneda moneda = new Moneda(record, monto);
                System.out.println(moneda);
            } catch (IOException | InterruptedException e) {
                System.err.println("Error al obtener la tasa de conversión: " + e.getMessage());
            }
        }
        scanner.close();
    }
}

