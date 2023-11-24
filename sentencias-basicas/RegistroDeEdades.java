import java.util.Scanner;

/**
 * Una fuente de datos registra varias edades, la edad 0 indica
 * el final del ingreso de datos, realizar un programa para
 * determinar el promedio de las edades ingresadas y además el
 * porcentaje de personas mayores a los 50 años
 */
public class RegistroDeEdades {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int edad;
		int edades = 0;
		int mayores50 = 0;
		int cantidad = 0;

		do {
			System.out.println("\nIntroduce un edad:");
			edad = scanner.nextInt();

			if(edad <= 0) break;
			if(edad > 50) mayores50++;
			edades += edad;
			cantidad++;
		} while(edad > 0);

		System.out.println("\nEl promedio de edad es: " + (edades / cantidad));
		System.out.println("El porcentaje de personas mayores a 50 años son: " + (mayores50 * 100 / cantidad) + "%");
		scanner.close();
	}
}