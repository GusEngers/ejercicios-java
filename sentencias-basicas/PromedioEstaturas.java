import java.util.Scanner;

/**
 * Leer una cierta cantidad de estaturas, la estatura 0 indica
 * el final del ingreso de datos, realizar un programa para
 * determinar el promedio de las estaturas ingresadas y además el
 * porcentaje de personas con estaturas menores a 1.60
 */
public class PromedioEstaturas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double estatura;
		int cantidad = 0;
		double estaturas = 0.0;
		int menores160 = 0;


		do {
			System.out.println("Ingrese una estatura (Ingresar 0 finaliza el programa)");
			estatura = scanner.nextDouble();

			if(estatura <= 0.0) break;
			if(estatura < 1.60) menores160++;
			estaturas += estatura;
			cantidad++;
		} while (estatura > 0.0);

		// Sentencia para formatear el resultado a solo dos decimales
		double total = Math.round(estaturas / cantidad * 100.0) / 100.0;

		System.out.println("\nEl promedio de estatura es: " + total);
		System.out.println("El porcentaje de personas con estaturas menores a 1.60 son: " + (menores160 * 100 / cantidad) + "%");

		scanner.close();
	}
}