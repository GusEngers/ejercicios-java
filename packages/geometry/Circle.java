package geometry;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Circle ejercicio = new Circle();

		// Ejercicio 1:
		// ejercicio.getArea();

		// Ejercicio 2:
		ejercicio.getPerimeter();
	}

	/**
	 * Ejercicio 1: Desarrollar un programa para obtener el
	 * área de un círculo según el radio indicado por el
	 * usuario.
	 * Fórmula:  AREA = PI x RADIO^2
	 */
	double radius;
	public void getArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		this.radius = scanner.nextDouble();

		double area = Math.PI * Math.pow(this.radius, 2);
		System.out.print("The area of the circle is: " + area);
	}


	/**
	 *	Ejercicio 2: Desarrollar un programa para obtener el
	 * perímetro de un círculo según el radio indicado por el
	 * usuario.
	 * Fórmula: PERIMETRO = DIAMETRO x PI
	 */
	public void getPerimeter() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		this.radius = scanner.nextDouble();

		double perimeter = 2 * this.radius * Math.PI;
		System.out.print("The perimeter of the circle is: " + perimeter);
	}
}
