package geometry;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		// Ejercicio 1:
		Circle ejercicio1 = new Circle();
		ejercicio1.getArea();
	}

	/**
	 * Ejercicio 1: Desarrollar un programa para obtener el
	 * área de un círculo según el radio indicado por el
	 * usuario
	 */
	double radius;
	public void getArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		this.radius = scanner.nextDouble();

		double area = Math.PI * Math.pow(this.radius, 2);
		System.out.print("The area of the circle is: " + area);
	}
}
