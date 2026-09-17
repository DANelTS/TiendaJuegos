package Modelo;

public class Purchase {

	private final Customer customer;
	private final Game game;
	private final int quantity;
	private final double totalprice;
	
	//Constructor
	public Purchase(Customer customer, Game game, int quantity) {
		if(customer == null) throw new IllegalArgumentException("El campo cliente no puede estar vacío");
		if(game == null) throw new IllegalArgumentException("El campo game no puede estar vacío");
		if(quantity <= 0)throw new IllegalArgumentException("La cantidad no puede ser menor o igual a cero");
		if(quantity > game.getStock()) throw new IllegalArgumentException("La cantidad no puede ser superior al stock");
		if((quantity * game.getPrice()) > customer.getBalance()) throw new IllegalArgumentException("El saldo no cubre la cantidad indicada");
		
		this.customer = customer;
		this.game = game;
		this.quantity = quantity;
		this.totalprice = game.getPrice() * quantity;
	}
	
	//Getters
	public Customer getCustomer() {return customer;}
	public Game getGame() {return game;}
	public int getQuantity() {return quantity;}
	public double getTotalPrice() {return totalprice;}
}
