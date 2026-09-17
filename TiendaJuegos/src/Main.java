import java.util.Scanner;
import Modelo.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static Store store = new Store();
	static String opcion;

	public static void main(String[] args) {
		
		//Bucle del menú
		do {
			System.out.println(mensaje());
			opcion = sc.nextLine();
			
			switch(opcion) {
			
			//Mostrar todos los juegos
			case "games":
				for(Game game : store.getJuegos()) {
					System.out.println(game.toString());
				}
				break;
			
			//Buscar por ID
			case "game<id>":
				System.out.print("Introduce el id del juego: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				Game juego = null;
				
				for(Game game : store.getJuegos()) {
					if(game.getID() == id) {
						juego = game;
						break;
					}

				}
				
				if(juego != null) System.out.println(juego.toString());
				else System.out.println("Juego no encontrado");
				
				break;
				
			case "salir":
				System.out.println("Adios");
				break;
			
			//Mensje por defecto
			default:
				System.out.println("Opción no válida");
			}
			
		} while(!opcion.equals("salir"));
	}
	
	//Metodo para cargar el mensaje del menú
	public static String mensaje() {
		return "-----------------------------------------------------------------"
				+ "\n Introduzca una opción:"
				+ "\n |- games: muestra todos los juegos del catálogo"
				+ "\n |- game<id>: muestra a que juego corresponde un identificador"
				+ "\n |- salir: sale de la aplicación"
				+ "\n-----------------------------------------------------------------"
				+ "\n";
	}
}
	
