import java.util.Scanner;
import java.math.BigDecimal;

/**
 * Escribir un programa que reciba del usuario los valores para los tres
 * argumentos de una ecuación de segundo grado.
 * Una ecuación de segundo grado se ve así:   ax^2 + bx + c = 0
 * Los valores que debemos pedir al usuario serían entonces:
 * - a
 * - b
 * - c
 */
public class EcuacionSegundoGrado {
	public static void main(String[] args) {
		System.out.println("--- Obteniendo argumentos ---");
		Ecuacion ecuacion = new Ecuacion();
		
		System.out.println("--- Generando discriminante ---");
		ecuacion.generarDiscriminante();
		
		System.out.println("--- Obteniendo resultados ---");
		ecuacion.obtenerResultados();

		System.out.println("--- Verificando resultados ---");
		ecuacion.verificarResultados();
	}
}

class Ecuacion {
	private double a;
	private double b;
	private double c;
	private double discriminante;
	private double resultado1;
	private double resultado2;

	public Ecuacion(){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el valor del primer argumento (a): ");
		this.a = scanner.nextDouble();

		System.out.print("Ingrese el valor del segundo argumento (b): ");
		this.b = scanner.nextDouble();

		System.out.print("Ingrese el valor del primer argumento (c): ");
		this.c = scanner.nextDouble();
	}

	public void generarDiscriminante() {
		this.discriminante = Math.pow(this.b, 2) - (4 * this.a * this.c);
	}

	public void obtenerResultados() {

		if(this.discriminante <= 0) {
			System.out.println("La ecuación no tiene resultados");
		} else {
			this.resultado1 = (-this.b + Math.sqrt(this.discriminante)) / (2 * this.a);
			this.resultado2 = (-this.b - Math.sqrt(this.discriminante)) / (2 * this.a);
			System.out.println("El primer resultado es: " + this.resultado1);
			System.out.println("El segundo resultado es: " + this.resultado2); 
		}
	}

	public void verificarResultados() {
		if (this.discriminante <= 0) {
			System.out.println("La ecuación no tiene resultados y como tal no se pueden verificar");
		} else {
			double ver1 = (this.a * Math.pow(this.resultado1, 2)) + (this.b * this.resultado1) + (this.c);
			double ver2 = (this.a * Math.pow(this.resultado2, 2)) + (this.b * this.resultado2) + (this.c);
			System.out.println("Reemplazamos las incognitas por " + this.resultado1 + " es igual a " + ver1);
			System.out.println("Reemplazando las incognitas por " + this.resultado2 + " es igual a " + ver2);
		}
	}
}