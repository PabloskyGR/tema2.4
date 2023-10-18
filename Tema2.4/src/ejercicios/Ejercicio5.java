package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número aleatorio que se vaya generando
		int num = (int) (Math.random() * 100) + 1;
		
		// Variable dopnde guardaremos la respuesta del usuario
		String respuesta = "";
		
		// Mensaje antes del do-while
		System.out.println("Voy a intentar adivinar el número que estas pensando.");
		
		// Mostramos una vez si el número aleatorio es el correcto, mayor o menor
		do {
			System.out.println("¿Tu número es el " + num + "?");
			System.out.println("Dime si es mayor, menor o es igual al número que has pensado:");
			respuesta = sc.nextLine().toLowerCase();
			
			// Si la respuesta es mayor, generará un número mayor respecto al anterior
			if (respuesta.equals("mayor")){
				num = (int) (Math.random() * (100 - num)) + num + 1;
			// Si la respuesta es menor, generará un número menor respecto el anterior
			} else if (respuesta.equals("menor")) {
				num = (int) (Math.random() * (num - 1)) + 1;
			// En caso de que la respuesta sea igual se terminara el juego y se saldrá del bucle
			} else if (respuesta.equals("igual")) {
				System.out.println("Fin del juego, he advinado tu número.");
				break;
			// Si la respuesta introducida no es ninguna de las 3 opciones, aparecerá un texto de error
			} else {
				System.err.println("Error al decir mayor, menor o igual");
			}
		} while (respuesta != "igual");
		
		// Cerramos el scanner
		sc.close();

	}

}
