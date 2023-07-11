package clases;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import interfaces.I_funcionesInternas;
import manejoJson.JsonUtilesHabitaciones;

public class Administrador extends Usuario{
	
	//Atributos propios
	
	private int idAdmin;
	
	
	//Constructor de la clase abstracta + atributos propios

	public Administrador(String nombre, int dni, String usuario, String contrasenia, String tipoDeUsuario, int idAdmin) {
		super(nombre, dni, usuario, contrasenia, tipoDeUsuario);
		// TODO Auto-generated constructor stub
		this.idAdmin = idAdmin;
	}
	
	//Getters y setters

	public Administrador() {
		
	}

	/**
	 * @return the idAdmin
	 */
	public int getIdAdmin() {
		return idAdmin;
	}


	/**
	 * @param idAdmin the idAdmin to set
	 */
	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	//Método toString
	
	@Override
	public String toString() {
		return "Administrador [idAdmin=" + idAdmin + ", getNombre()=" + getNombre() + ", getDni()=" + getDni()
				+ ", getUsuario()=" + getUsuario() + ", getContrasenia()=" + getContrasenia() + ", getTipoDeUsuario()="
				+ getTipoDeUsuario() + "]";
	}
	
	
	
	//MÉTODOS PROPIOS 
	
	//agregar habitación
	public void agregarHabitacion(JSONArray habitaciones) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(habitaciones);

		System.out.print("Cuantas habitaciones deseas crear?: ");
		int numObjetos = scanner.nextInt();

		for (int i = 1; i <= numObjetos; i++) {
			System.out.println("Habitaciones #" + i);
			JSONObject jsonObject = new JSONObject();

			System.out.print("Cuantas claves y valores deseas agregar? ");
			int numClavesValores = scanner.nextInt();

			for (int j = 1; j <= numClavesValores; j++) {
				System.out.print("Ingrese la clave " + j + ": ");
				String clave = scanner.next();

				System.out.print("Ingrese el valor " + j + ": ");
				String valor = scanner.next();

				try {
					jsonObject.put(clave, valor);
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}
			habitaciones.put(jsonObject);
			JsonUtilesHabitaciones.grabar(habitaciones);
		}

		System.out.println("La lista de habitaciones es: " + habitaciones.toString());


	}


	
	//eliminar habitación
public void borrar(JSONArray habitaciones) {
	Scanner scanner = new Scanner(System.in);
	 System.out.println("Ingrese la posicion de la habitacion que quiere borrar:");
	int e=scanner.nextInt();
   System.out.println("La habitacion en la posicion" + e + " ha sido borrado correctamente");
    
   habitaciones.remove(e);
}
}
	
	


