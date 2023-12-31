package numbers;
import java.util.Scanner;

public class Number {
	Scanner scanner = new Scanner(System.in);
	int number1, number2;

  public static void main(String[] args) {
  	Number number = new Number();

  	// Ejercicio 1:
  	number.compareNumbers();

  	// Ejercicio 2:
  	number.isPositiveOrNegative();

  	// Ejercicio 3:
  	number.isMultiple();

  	// Ejercicio 4:
  	number.isGreaterThan();

  	// Ejercicio 5:
  	number.howManyDigits();

    // Ejercicio 6:
    number.seeBackwards();

    // Ejercicio 7:
    number.isPalindromic();

    // Ejercicio 8:
    number.thatNote();
  }

  /**
   * Ejercicio 1: Desarrollar un programa para
   * comparar si dos números ingresados por el
   * usuario son iguales. 
   */
  public void compareNumbers() {
    System.out.println("-- Exercise 1 --");
  	System.out.print("Enter the first number: ");
  	this.number1 = this.scanner.nextInt();

  	System.out.print("Enter the second number: ");
  	this.number2 = this.scanner.nextInt();

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
    System.out.println("\n-- Exercise 2 --");
  	System.out.print("Enter a number: ");
  	this.number1 = this.scanner.nextInt();

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
    System.out.println("\n-- Exercise 3 --");
  	System.out.print("Enter the first number: ");
  	this.number1 = this.scanner.nextInt();

  	System.out.print("Enter the second number: ");
  	this.number2 = this.scanner.nextInt();

  	if (this.number1 % this.number2 == 0) {
  		System.out.print("The number " + this.number1 + " is a multiple for the number " + this.number2);
  	} else {
  		System.out.print("The number " + this.number1 + " isn't a multiple for the number " + this.number2);
  	}
  }

  /**
   * Ejercicio 4: Desarrollar un programa para
   * determinar cuál de dos números ingresados
   * por el usuario es mayor.
   */
  public void isGreaterThan() {
    System.out.println("\n-- Exercise 4 --");
  	System.out.print("Enter the first number: ");
  	this.number1 = this.scanner.nextInt();

  	System.out.print("Enter the second number: ");
  	this.number2 = this.scanner.nextInt();

  	if (this.number1 > this.number2) {
  		System.out.print("The number " + this.number1 + " is greater than the number " + this.number2);
  	} else if (this.number1 < this.number2) {
  		System.out.print("The number " + this.number2 + " is greater than the number " + this.number1);
  	} else {
  		System.out.print("The numbers are equal");
  	}
  }

  /**
   * Ejercicio 5: Desarrollar un programa para
   * determinar cuántas cifras posee un número
   * ingresado por el usuario (1 - 9999).
   */
  public void howManyDigits() {
    System.out.println("\n-- Exercise 5 --");
  	System.out.print("Enter a number between 1 and 9999: ");
  	this.number1 = this.scanner.nextInt();

  	if (this.number1 > 9999 || this.number1 <= 0) {
  		System.out.print("The number is invalid");
  	} else if (this.number1 > 0 && this.number1 < 10) {
  		System.out.print("The number has 1 digit");
  	} else if (this.number1 >= 10 && this.number1 < 100) {
  		System.out.print("The number has 2 digits");
  	} else if (this.number1 >= 100 && this.number1 < 1000) {
  		System.out.print("The number has 3 digits");
  	} else {
  		System.out.print("The number has 4 digits");
  	}
  }

  /**
   * Ejercicio 6: Desarrollar un programa que
   * recibe un número entre 1 y 9999 ingresado
   * por el ususario y luego muestra el número
   * dado vuelta.
   */
  public void seeBackwards() {
    System.out.println("\n-- Exercise 6 --");
    System.out.print("Enter a number between 1 and 9999: ");
    this.number1 = this.scanner.nextInt();

    if (this.number1 > 9999 || this.number1 <= 0) {
      System.out.print("The number is invalid");
    } else {
      String value = String.valueOf(this.number1);
      String aux = "";

      for (int i = value.length() - 1; i >= 0; i--) {
        aux += value.charAt(i);
      }

      System.out.print(value + " is " + aux);
    }

  }

  /**
   * Ejercicio 7: Desarrollar un programa que
   * verifique si un número ingresado por el
   * usuario es capicua.
   */
  public void isPalindromic() {
    System.out.println("\n-- Exercise 7 --");
    System.out.print("Enter a number greater than 0: ");
    this.number1 = this.scanner.nextInt();

    if (this.number1 <= 0) {
      System.out.print("The number is invalid");
    } else {
      String value = String.valueOf(this.number1);
      String aux = "";

      for (int i = value.length() - 1; i >= 0; i--) {
        aux += value.charAt(i);
      }

      if (value.equals(aux)) {
        System.out.print("The number " + value + " is palindromic");
      } else {
        System.out.println("The number " + value + " isn't palindromic");
      }
    }
  }

  /**
   * Ejercicio 8: Desarrollar un programa que
   * obtenga una nota del 1 al 10 del usuario
   * y muestre si es INSUFICIENTE, REGULAR,
   * BIEN o EXCELENTE 
   */
  public void thatNote() {
    System.out.println("\n-- Exercise 8 --");
    System.out.print("Enter a note between 1 and 10: ");
    this.number1 = this.scanner.nextInt();

    switch (this.number1) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.print("UNSATISFACTORY");
        break;
      case 6:
        System.out.print("REGULAR");
        break;
      case 7:
      case 8:
      case 9:
        System.out.print("GOOD");
        break;
      case 10:
        System.out.print("EXCELLENT");
        break;
      default:
        System.out.print("Invalid note");
        break;
    }
  }
}
