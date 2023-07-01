package clases;
import java.time.LocalDate;
public class Reserva {
//Atributos 
	private Pasajero pasajero;
	private Habitacion habitacion;
	private LocalDate inicio;
	private LocalDate fin;
	
	//Constructor
	/**
	 * @param Pasajero
	 * @param habitacion
	 * @param inicio
	 * @param fin
	 */
	public Reserva(Pasajero pasajero, Habitacion habitacion, LocalDate inicio, LocalDate fin) {
		super();
		this.pasajero = pasajero;
		this.habitacion = habitacion;
		this.inicio = inicio;
		this.fin = fin;
	}
	//Metodos

	/**
	 * @return the Pasajero
	 */
	public Pasajero getPasajero() {
		return pasajero;
	}


	/**
	 * @return the habitacion
	 */
	public Habitacion getHabitacion() {
		return habitacion;
	}

	/**
	 * @return the inicio
	 */
	public LocalDate getInicio() {
		return inicio;
	}


	/**
	 * @return the fin
	 */
	public LocalDate getFin() {
		return fin;
	}

	
	
	
	
}
