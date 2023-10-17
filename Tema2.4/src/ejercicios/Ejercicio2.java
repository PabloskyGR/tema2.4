package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número 
		int num = 0;
		
		// Mensaje antes de mostrar los números
		System.out.println("Los números pares entre el 0 y el 200 son:");
		
		// Ejecutamos una vez la condiciçión con el do
		do {
			if (num % 2 == 0){ // Calculamos si es par 
				System.out.println(num); // Mostramos si el número es par
			}
			num++; // Sumamos 1 al número para comprobar el siguiente si es par
			
		} while (num <= 200); // Lo realizamos siempre y cuando el número sea menor a 200

	}

}
