package numbers;
import java.util.Scanner;

public class Number {
	Scanner scanner = new Scanner(System.in);
	double number1, number2;

  public static void main(String[] args) {
  	Number number = new Number();

  	// Ejercicio 1:
  	// number.compareNumbers();

  	// Ejercicio 2:
  	// number.isPositiveOrNegative();

  	// Ejercicio 3:
  	number.isMultiple();
  }

  /**
   * Ejercicio 1: Desarrollar un programa para
   * comparar si dos números ingresados por el
   * usuario son iguales. 
   */
  public void compareNumbers() {
  	System.out.print("Enter the first number: ");
  	this.number1 = this.scanner.nextDouble();

  	System.out.print("Enter the second number: ");
  	this.number2 = this.scanner.nextDouble();

  	if (this.number1 == this.number2) {
  		System.out.print("The numbers are equal");
  	} else {
  		System.out.print("The numbers aren't equal");
  	}
  }

  /**
   * Ejercicio 2: Desarrollar un programa para
   * determinar si un número ingresado por el
   * usuario es positivo o negativo.
   */
  public void isPositiveOrNegative() {
  	System.out.print("Enter a number: ");
  	this.number1 = this.scanner.nextDouble();

  	if (this.number1 > 0) {
  		System.out.print("The number is POSITIVE");
  	} else if (this.number1 < 0) {
  		System.out.print("The number is NEGATIVE");
  	} else {
  		System.out.print("The number is ZERO");
  	}
  }

  /**
   * Ejercicio 3: Desarrollar un programa para
   * determinar si dos números ingresados por el
   * usuario son múltiplos.
   */
  public void isMultiple() {
  	System.out.print("Enter the first number: ");
  	this.number1 = this.scanner.nextDouble();

  	System.out.print("Enter the second number: ");
  	this.number2 = this.scanner.nextDouble();

  	if (this.number1 % this.number2 == 0) {
  		System.out.print("The number " + this.number1 + " is a multiple for the number " + this.number2);
  	} else {
  		System.out.print("The number " + this.number1 + " isn't a multiple for the number " + this.number2);
  	}
  }
}
