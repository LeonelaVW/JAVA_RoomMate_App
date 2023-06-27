package interfaces;
import java.time.LocalDate;

import clases.*;

public interface I_funcionesInternas {
	void verListadoDePasajeros();
	void verListadoDeEmpleados();
	void verListadoDeHabitaciones();
	boolean verDisponibilidadXFecha(Habitacion habitacion, Reserva inicio, Reserva fin);
	void verHistorialXPasajero(Usuario DNI);
	void verHistorialXHabitacion(Habitacion numero);
	
		
	

}
