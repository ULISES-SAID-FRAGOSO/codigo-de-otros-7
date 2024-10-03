import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		HashMap<String, String> capitales = new HashMap<>();
		
		capitales.put("Canadá", "Otawwa");
		capitales.put("Estados Unidos", "Washington DC");
		capitales.put("México", "México DF");
		capitales.put("Belice", "Belmopán");
		capitales.put("Costa rica", "San José");
		capitales.put("El Salvador", "San salvador");
		capitales.put("Guatemala", "Ciudad de Guatemala");
		capitales.put("Honduras", "Tegucigalpa");
		capitales.put("Nicaragua", "Managua");
		capitales.put("Panamá", "Panamá");
		
		String c = "";
		
		do {
			System.out.print("Escribe el nombre de un país y te diré su capital: ");
			c = s.nextLine();
			
			if (!c.equalsIgnoreCase("salir")) {
				if (capitales.containsKey(c)) {
					System.out.println("La capital de " + c + " es " + capitales.get(c));
				} else {
					System.out.print("No conozco la respuesta ");
					System.out.print("¿cuál es la capital de " + c + "?: ");
					String capital = s.nextLine();
					capitales.put(c, capital);
					System.out.println("Gracias por enseñarme nuevas capitales");
				}
			}
		} while (!c.equals("salir"));
	}//main
	}// class