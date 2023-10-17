package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// variable donde guardaremos el número que introduzca el usuario
		int n;
		
		// Variable donde guardaremos la suma de todos los números
		int suma = 0;
		
		// Variable donde se ira guardando los números anteriores al introducido
		int cont = 1;
		
		// Le pedimos al usuario un número
		System.out.println("Dime un número y sumare todos los números anteriores a el:");
		n = sc.nextInt();

		// Con el do, le sumamos el número del cont a la variable suma
		do {
			suma += cont; // Sumamos el número de la variable cont a la variable suma
			cont++; // Incrementamos el número en 1 para poder sumarlo en la variable suma
		} while (cont <= n); // Se realiza el bucle mientras el número de la variable cont sea menor al número del usuario
		
		// Mostramos la suma de los números
		System.out.println("La suma empezando por 1 hasta " + n + " es de: " + suma);
		
		// Cerramos el scanner
		sc.close();
		
		

	}

}
