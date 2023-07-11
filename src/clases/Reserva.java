package clases;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.*;
import manejoJson.*;
import org.json.*;
import clases.*;
import java.util.*;
public class Reserva {
//Atributos 
	private Pasajero pasajero;
	private Habitacion habitacion;
	private LocalDate inicio;
	private LocalDate fin;
	private JSONArray [] reservas2;
	
	
	
	
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
	public Reserva() {
		super();
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
//Metodos 
	
	public void habitacionesDisponibles(JSONArray habitaciones) {
		System.out.println("Las habitaciones disponibles son: " + manejoJson.JsonUtilesUsuarios.leer("habitaciones.json"));
	}
	
	public void hacerReserva(Reserva[] reservas2) {
		Scanner scanner = new Scanner(System.in);
		int e=scanner.nextInt();
		System.out.println("Ingrese el numero de la habitacion que desee reservar: " + e);
		System.out.println("La habitacion #" + e + " ha sido reservada correctamente");
		
	}
	
	
    }

	
	
	
	
