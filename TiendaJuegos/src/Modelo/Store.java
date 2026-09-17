package Modelo;

import java.util.ArrayList;

public class Store {
	
	private ArrayList<Game> games;
	private ArrayList<Customer> customers;
	private ArrayList<Purchase> purchases;
	
	//Constructor
	public Store() {
		games = new ArrayList<Game>();
		customers = new ArrayList<Customer>();
		purchases = new ArrayList<Purchase>();
	}
	
	//Getters
	public ArrayList<Game> getJuegos() {return games;}
	public ArrayList<Customer> getClientes() {return customers;}
	public ArrayList<Purchase> getVentas() {return purchases;}
	
	//Añadir videojuegos
	public void añadirJuego(Game game) {
		for(Game g : games) {
			if(g.getID() == game.getID()) throw new IllegalArgumentException("Juego ya en catálogo");
		}
		
		games.add(game);
	}
	
	//Buscar videojuegos
	public Game buscarJuegoID(int id) {
		for(Game game : games) {
			if(game.getID() == id) return game;
		}
		
		throw new IllegalArgumentException("Juego no encontrado en catálogo");
	}
	
	//Buscar clientes
	public Customer buscarCliente(int id) {
		for(Customer customer : customers) {
			if(customer.getID() == id) return customer;
		}
		
		throw new IllegalArgumentException("Cliente no existente");
	}
	
	//Buscar por texto
	public ArrayList<Game> buscarJuegoTexto(String str) {
		ArrayList<Game> juegos = new ArrayList<Game>();
		
		for(Game game : games) {
			if(game.getTitle().toLowerCase().contains(str.toLowerCase())) juegos.add(game);
		}
		
		if(juegos.isEmpty()) System.out.println("No hay juegos con ese nombre");
		
		return juegos;
	}
	
	//Filstrar por género
	public ArrayList<Game> filtrarGenero(Genre genre) {
		ArrayList<Game> juegos = new ArrayList<Game>();
		
		for(Game game : games) {
			if(game.getGenre().equals(genre)) juegos.add(game);
		}
		
		return juegos;
	}
	
	//Comprar videojuegos
	public void comprarJuego(Game game, Customer customer, int quantity) {
		for(Game g : games) {
			for (Customer c : customers) {
				if(g == game && c == customer && quantity > 0 && quantity <= g.getStock() && c.getBalance() >= (g.getPrice() * quantity)) {
					g.reducirStock(quantity);
					c.reducirSaldo(g.getPrice() * quantity);
					Purchase purchase = new Purchase(customer, game, quantity);
					purchases.add(purchase);
				}
			}
		}
	}
}
