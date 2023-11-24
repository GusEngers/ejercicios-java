import java.util.Scanner;

/**
 * Contar una lista de `n` números ingresados por teclado, el
 * número 0 indica el final del programa, luego obtener:
 * - Total de números positivos
 * - Total de números negativos 
 * - Promedio de números positivos
 * - Promedio de números negativos
 */
public class ListaNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero;

		int totalPositivos = 0;
		int sumaPositivos = 0;

		int totalNegativos = 0;
		int sumaNegativos = 0;

		do {
			System.out.print("Ingrese un número entero (Ingresar 0 finaliza el programa):   ");
			numero = scanner.nextInt();

			if(numero == 0) break;
			if(numero < 0) {
				totalNegativos++;
				sumaNegativos += numero * -1;
			}
			if(numero > 0) {
				totalPositivos++;
				sumaPositivos += numero;
			}
		} while (numero != 0);

		System.out.println("\nEl total de NÚMEROS POSITIVOS es: " + totalPositivos);
		System.out.println("El promedio de NÚMEROS POSITIVOS es: " + (sumaPositivos / totalPositivos));
		
		System.out.println("\nEl total de NÚMEROS NEGATIVOS es: " + totalNegativos);
		System.out.println("El promedio de NÚMEROS NEGATIVOS es: -" + (sumaNegativos / totalNegativos));

		scanner.close();
	}
}