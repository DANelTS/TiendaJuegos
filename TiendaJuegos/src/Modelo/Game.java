package Modelo;
import java.time.LocalDate;
import java.util.ArrayList;

public class Game {
	private static int contador = 1;

	private int idJuego;
	private String titulo;
	private GameGenre genre;
	private Platform platform;
	private double precio;
	private Classification classification;
	private String desarrollador;
	private LocalDate fechaLanzamiento;
	private int stock;
	private String descripcion;
	private double puntuacion;
	private ArrayList<Tags> tags;

	public Game(String titulo, GameGenre genre, Platform platform, double precio, Classification classification,
			String desarrollador, LocalDate fechaLanzamiento, int stock, String descripcion, double puntuacion,
			ArrayList<Tags> tags) {
		this.idJuego = contador++;
		this.titulo = titulo;
		this.genre = genre;
		this.platform = platform;
		this.precio = precio;
		this.classification = classification;
		this.desarrollador = desarrollador;
		this.fechaLanzamiento = fechaLanzamiento;
		this.stock = stock;
		this.descripcion = descripcion;
		this.puntuacion = puntuacion;
		this.tags = tags;
	}
	
	public int getIdJuego() {
		return idJuego;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public GameGenre getGenre() {
		return genre;
	}

	public void setGenre(GameGenre genre) {
		this.genre = genre;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public String getDesarrollador() {
		return desarrollador;
	}

	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}

	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public ArrayList<Tags> getTags() {
		return tags;
	}

	public void setTags(ArrayList<Tags> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Game [idJuego=" + idJuego + ", titulo=" + titulo + ", genre=" + genre + ", platform=" + platform
				+ ", precio=" + precio + ", classification=" + classification + ", desarrollador=" + desarrollador
				+ ", fechaLanzamiento=" + fechaLanzamiento + ", stock=" + stock + ", descripcion=" + descripcion
				+ ", puntuacion=" + puntuacion + ", tags=" + tags + "]";
	}

}
