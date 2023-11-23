import java.util.Scanner;

/**
 * Dado un número entero que se introduce por teclado,
 * determinar si es un número negativo o superior a 100
 */
public class NegativoSuperior {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un número entero:");
		int numero = scanner.nextInt();

		if (numero < 0 || numero > 100) {
			if (numero < 100) {
				System.out.println("El número " + numero + " ingresado es negativo");
			} else {
				System.out.println("El número " + numero + " ingresado es superior a 100");
			}
		} else {
			System.out.println("El número " + numero + " ingresado no es ni negativo y ni superior a 100");
		}

		scanner.close();
	}
}