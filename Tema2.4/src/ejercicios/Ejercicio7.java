package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el primer número que introduzca el usuario
		double num1;
		
		// Variable donde guardaremos el segundo número que introduzca el usuario
		double num2;
		
		// Variable donde guardaremos la opción del menú que elija el usuario
		String menu;
		
		// Mostramos cada vez que se repita el bucle el menú y le pedimos los dos números
		do {
			// Le pedimos al usuario dos números
			System.out.println("Dime 2 números:");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			// Mostramos el menú
			System.out.println("Dime que quieres hacer:");
			System.out.println();
			System.out.println(" - - - - - - - - - - - - - - - ");
			System.out.println("| A. SUMAR LOS NÚMEROS        | \n"  +
							   "| B. RESTAR LOS NÚMEROS       | \n"  +
							   "| C. MULTIPLICAR LOS NÚMEROS  | \n"  +
							   "| D. DIVIDIR LOS NÚMEROS      | \n"  +
							   "| E. SALIR                    |");
			System.out.println(" - - - - - - - - - - - - - - - ");
			menu = sc.next().toUpperCase();
		
			// Usando el switch mostramos la opción necesaria en base lo que quiera el usuario
			switch (menu) {
			case "A": // Opción de suma
				System.out.println("La suma de " + num1 + " + " + num2 + " es de: " + (num1 + num2));
				break;
			case "B": // Opción de resta
				System.out.println("La resta de " + num1 + " - " + num2 + " es de: " + (num1 - num2 ));
				break;
			case "C": // Opción de multiplicación
				System.out.println("La multiplicación de " + num1 + " * " + num2 + " es de: " + (num1 * num2));
				break;
			case "D": // Opción de división
				System.out.println("La división de " + num1 + " / " + num2 + " es de: " + (num1 / num2));
				break;
			case "E": // Opción para salir del programa
				System.out.println("Saliendo...");
				break;
			default: // Opción default por si no es correcto el valor introducido
				System.out.println("Opción no válida");
			}
			
		} while (!menu.equals("E")); // El bucle siempre se ejecutará hasta que el usuario no quiera salir con la opción "E"

		// Cerramos el scanner
		sc.close();
	}

}
