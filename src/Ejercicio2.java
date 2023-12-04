
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce palabras (Ctrl+Z para finalizar):");
		while (scanner.hasNext()) {
			String palabra = scanner.next();
			String resultado = Ejercicio1.cambiarLetras(palabra);
			System.out.println("Palabra original: " + palabra);
			System.out.println("Resultado: " + resultado);
		}
	}
}
