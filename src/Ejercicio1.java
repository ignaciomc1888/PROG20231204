
public class Ejercicio1 {

	public static String cambiarLetras(String input) {
		if (input.length() <= 2) {
			return input;
		}
		String middle = "*".repeat(input.length() - 2);
		return input.charAt(0) + middle + input.charAt(input.length() - 1);
	}
}
