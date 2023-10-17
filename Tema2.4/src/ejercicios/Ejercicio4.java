package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// Variable donde iremos guardando los números hasta el 10, para multiplicar
		int cont = 1;
		
		// Variable donde se guardara el número que introduzca el usuario
		int num;
		
		// Le pedimos al usuario que tabla quiere que se le muestre
		System.out.println("Dime que tabla de multiplicar:");
		num = sc.nextInt();
		
		// Mensaje antes de mostrar la tabal de multiplicar
		System.out.println("La tabla del " + num + " es la siguiente:");
		
		// Realizamos 1 vez la multiplicación por el número que corresponda sin superar al 10
		do {
			System.out.println(num + " x " + cont + " = " + (num * cont)); // Mostramos el número introducido por cada número de la tabla
			cont++; // Sumamos 1 a la variable para pasar a la siguiente multiplicación
		} while (cont <= 10); // Realizaremos el bucle hasta que la vartiable cont llegue a 10

		// Cerramos el scanner
		sc.close();
	}

}
