import java.util.Scanner;

/**
 * Escribir un programa que pida el tipo de moneda de cambio (DOLAR o PESO)
 * y según la elección realizar:
 * - Si el tipo de moneda de cambio es DOLAR, el usuario debe ingresar
 * 	 la cantidad de PESOS que desea convertir a DOLARES
 * - Si el tipo de moneda de cambio es PESO, el usuario debe ingresar
 * 	 la cantidad de DOLARES que desea convertir a PESOS
 * 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * PLUS: Si es posible utilizar la cotización en tiempo real  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */
public class Conversor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 24-11-23
		double valor = 348.96;

		System.out.print("Ingresa la moneda a convertir (PESO o DOLAR):   ");
		String moneda = scanner.nextLine();

		if (moneda.contains("PESO") || moneda.contains("peso")){

			System.out.print("\nIngrese los DOLARES a convertir en PESOS:  ");
			double dolares = scanner.nextDouble();
			System.out.println(dolares + " DOLARES es igual a " + (Math.round(dolares * valor * 100.0) / 100.0) + " PESOS");

		} else if(moneda.contains("DOLAR") || moneda.contains("dolar")) {

			System.out.print("\nIngrese los PESOS a convertir en DOLARES:  ");
			double pesos = scanner.nextDouble();
			System.out.println(pesos + " PESOS es igual a " + (Math.round(pesos / valor * 100.0) / 100.0) + " DOLARES");

		} else {
			System.out.println("El valor ingresado no es válido");
		}

		scanner.close();
	}
}