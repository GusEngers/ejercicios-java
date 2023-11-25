package numbers;
import java.util.Scanner;

public class Number {
	double number1, number2;
  public static void main(String[] args) {
  	Number number = new Number();

  	// Ejercicio 1:
  	number.compareNumbers();
  }
  
  /**
   * Ejercicio 1: Desarrollar un programa para
   * comparar si dos números ingresados por el
   * usuario son iguales. 
   */
  public void compareNumbers() {
  	Scanner scanner = new Scanner(System.in);

  	System.out.print("Enter the first number: ");
  	this.number1 = scanner.nextDouble();

  	System.out.print("Enter the second number: ");
  	this.number2 = scanner.nextDouble();

  	if (this.number1 == this.number2) {
  		System.out.print("The numbers are equal");
  	} else {
  		System.out.print("The numbers aren't equal");
  	}
  }
}
