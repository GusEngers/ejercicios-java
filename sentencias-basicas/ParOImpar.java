import java.util.Scanner;

/**
 * Dado un número entero y positivo que se introduce por teclado,
 * determinar si es "Par" o "Impar" 
 */
public class ParOImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un número entero positivo:");
		int numero = scanner.nextInt();

		if (numero <= 0) {
			System.out.println("Este programa sólo admite números enteros positivos");
		} else if (numero % 2 == 0) {
			System.out.println("El número " + numero + " ingresado es un número PAR");
		} else {
			System.out.println("El número " + numero + " ingresado es un número IMPAR");
		}

		scanner.close();
	}
}