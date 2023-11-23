import java.util.Scanner;

/**
 * Dado un número entero que se introduce por teclado,
 * determinar si es positivo, negativo o nulo (cero)
 */
public class PositivoNegativoNulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un número entero:");
		int numero = scanner.nextInt();

		if (numero < 0) {
			System.out.println("El número " + numero + " ingresado es NEGATIVO");
		} else if (numero > 0) {
			System.out.println("El número " + numero + " ingresado es POSITIVO");
		} else {
			System.out.println("El número " + numero + " ingresado es NULO");
		}
	}
}