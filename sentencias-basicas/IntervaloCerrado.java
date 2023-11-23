import java.util.Scanner;

/**
 * Dado un número entero que se introduce por teclado,
 * determinar si se encuentra en el intervalo cerrado [51; 100]
 */
public class IntervaloCerrado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un número entero:");
		int numero = scanner.nextInt();

		if (numero >= 51 && numero <= 100) {
			System.out.println("El número " + numero + " ingresado se encuentra dentro del intervalo cerrado [51; 100]");
		} else {
			System.out.println("El número " + numero + " ingresado no se encuentra dentro del intervalo cerrado [51; 100]");
		}
	}
}