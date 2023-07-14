package clases;
import org.json.*;

public class Habitacion {
//Atributos
	private int numero;
	private String tipo;
	private String estado;
	private String motivoNoDisponibilidad;
	private double precio;
	private categoriaHabitacion categoria;
	private boolean isFree;
	
	//Constructor
	/**
	 * @param numero
	 * @param tipo
	 * @param estado
	 * @param motivoNoDisponibilidad
	 * @param precio
	 * @param categoria
	 * @param isFree 
	 */
	public Habitacion(int numero, String tipo, String estado, String motivoNoDisponibilidad, double precio,
			categoriaHabitacion categoria, boolean isFree) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.estado = estado;
		this.motivoNoDisponibilidad = motivoNoDisponibilidad;
		this.precio = precio;
		this.categoria = categoria;
		this.isFree = isFree;
	}
	//Metodos
	
	public Habitacion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the isFree
	 */
	public boolean isFree() {
		return isFree;
	}

	/**
	 * @param isFree the isFree to set
	 */
	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the motivoNoDisponibilidad
	 */
	public String getMotivoNoDisponibilidad() {
		return motivoNoDisponibilidad;
	}

	/**
	 * @param motivoNoDisponibilidad the motivoNoDisponibilidad to set
	 */
	public void setMotivoNoDisponibilidad(String motivoNoDisponibilidad) {
		this.motivoNoDisponibilidad = motivoNoDisponibilidad;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the categoria
	 */
	public categoriaHabitacion getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(categoriaHabitacion categoria) {
		this.categoria = categoria;
	}
	
	public void getOcupante() {
		
	}
	
	public void setOcupante(Pasajero pasajero) {
		
	}
	
	public void ocuparHabitacion(Pasajero pasajero) {
		
	}
	public void desocuparHabitacion() {
		
	}
	public void marcarHabitacionNoDisponible(String motivo) {
		System.out.println("La habitacion no esta disponible porque " + motivo);
		
	}

}
