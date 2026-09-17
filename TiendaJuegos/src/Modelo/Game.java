package Modelo;

public class Game {
	
	private static int counter = 1;
	private final int ID;
	private String title;
	private Genre genre;
	private double price;
	private int stock;
	
	//Constructor
	public Game(String title, Genre genre, double price, int stock) {
		if(title == null || title.isBlank()) throw new IllegalArgumentException("El título no puede estar vacío");
		if(genre == null) throw new IllegalArgumentException("El genero no puede estar vacío");
		if(price < 0) throw new IllegalArgumentException("El precio no puede ser negativo");
		if(stock < 0) throw new IllegalArgumentException("El stock no puede ser negativo");
		
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.stock = stock;
		this.ID = counter++;
	}
	
	//Getters
	public int getID() {return ID;}
	public String getTitle() {return title;}
	public Genre getGenre() {return genre;}
	public double getPrice() {return price;}
	public int getStock() {return stock;}
	
	//Modificadores de stock
	public void setStock(int n) {
		if(n < 0) throw new IllegalArgumentException("Cantidad invalida");
		stock = n;
	}
	
	public void aumentarStock(int n) {
		if(n < 0) throw new IllegalArgumentException("Cantidad invalida");
		stock += n;
	}
	
	public void reducirStock(int n) {
		if(n > stock || n < 0) throw new IllegalArgumentException("Cantidad invalida");
		stock -= n;
	}
	
	//Comprobar si hay unidades disponibles
	public boolean hayStock() {return stock > 0;}
	
	//Representación textual del juego
	@Override
	public String toString() {
		return "---------------"
				+ "\n Título: " + title
				+ "\n Género: " + genre
				+ "\n Precio: " + price
				+ "\n Stock:  " + stock
				+ "\n---------------";
	}
}
