package Modelo;

public class Customer {
	
	private static int counter = 1;
	private final int ID;
	private String name;
	private double balance;
	
	//Constructor
	public Customer(String name, double balance) {
		if(name == null || name.isBlank()) throw new IllegalArgumentException("El nombre no puede estar vacío");
		if(balance < 0) throw new IllegalArgumentException("El saldo no puede ser negativo");
		
		this.name = name;
		this.balance = balance;
		this.ID = counter++;
	}
	
	//Getters
	public int getID() {return ID;}
	public String getName() {return name;}
	public double getBalance() {return balance;}
	
	//Modificar saldo
	public void añadirSaldo(double n) {
		if(n < 0) throw new IllegalArgumentException("Cantidad invalida");
		this.balance += n;
	}
	
	public void reducirSaldo(double n) {
		if(n < 0 || (balance - n) < 0) throw new IllegalArgumentException("Cantidad invalida");
		this.balance -= n;
	}
	
	//Comprobar disponibilidad de saldo
	public boolean haySaldo(int n) {return balance >= n;}
	
	//Representación textual del cliente
	@Override
	public String toString() {
		return "---------------"
				+ "\n Nombre: " + name
				+ "\n Saldo:  " + balance
				+ "\n---------------";
	}
}
