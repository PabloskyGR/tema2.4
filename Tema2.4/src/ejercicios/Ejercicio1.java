package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número 
		int num = 0;
		
		// Mensaje antes de mostrar los números
		System.out.println("Los números hasta el 20 son:");
		
		// Con el do, sumamos 1 al número y lo mostramos
		do {
			num++;
			System.out.println(num);
		} while (num < 20); // Con el while vamos mostrando lo anterior sin superar el número 20
			
	}

}
