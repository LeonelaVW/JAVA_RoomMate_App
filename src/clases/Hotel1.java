package clases;

import java.util.Scanner;

import org.json.*;

public class Hotel1 {
	// Atributos
	private String nombre;
	private String direccion;
	private Habitacion habitaciones[];

	// Hacer de reserva una clase Padre/Abstracta
	private static Reserva reservas[];
	
	private JSONTokener usuarios;
	public static Scanner teclado;

	public Hotel1(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.teclado = new Scanner(System.in);
	}

	public Hotel1() {
		this.nombre = "Hermitage";
		this.direccion ="1234";
		this.usuarios = manejoJson.JsonUtilesUsuarios.leer("usuarios.json");
	}

	public static void mostrarMenuPrincipal(Scanner teclado) {

		System.out.println("------- Menu Principal -------");
		System.out.println("1. Crear cuenta");
		System.out.println("2. Ver habitaciones disponibles");
		System.out.println("3. Hacer reserva");
		System.out.println("4. Cancelar reserva");
		System.out.println("0. Salir");

		int opcion = teclado.nextInt();

		switch (opcion) {
		case 1://crear cuenta
			System.out.println("Que rol quiere registrar?\n1- Pasajero\n2-Administrador\n3-Conserje");
			int rol = teclado.nextInt();
			crearCuenta(rol);
			break;
		case 2://ver habitaciones disponibles
			System.out.println("Habitaciones disponibles:");
System.out.println(manejoJson.JsonUtilesHabitaciones.leer("habitaciones.json"));
			break;
		case 3://hacer reserva
				
		
			break;
		case 4:
			
			break;
		case 0:
			System.out.println("Gracias por utilizar nuestro servicio, hasta pronto!");
			break;
		default:
			System.out.println("Opcion invalida. Intente nuevamente.");
			break;
		}
	}

	public static void crearCuenta(int rol) {

		if (rol == 1) {
			Pasajero pasajero = new Pasajero();
			// Cargar todos los datos de usuario y pasajero
	            System.out.println("Ingrese su nombre completo:");
	            pasajero.setNombre(teclado.next());
	            System.out.println("Ingrese su DNI:");
	            pasajero.setDni(teclado.next());
	            System.out.println("Ingrese su nombre de usuario:");
	            pasajero.setUsuario(teclado.next());
	            System.out.println("Ingrese su contrasena:");
	            pasajero.setContrasenia(teclado.next());
	            System.out.println("Indique su ciudad de origen");
	            pasajero.setCiudadDeOrigen(teclado.next());
	            System.out.println("Indique su domicilio legal");
	            pasajero.setDomicilioDeOrigen(teclado.next());
		
			cargarUsuarioJSON(pasajero);

		} else if (rol == 2) {
			Administrador admin = new Administrador();
			// Cargar todos los datos de usuario y admin
			System.out.println("Ingrese su nombre completo:");
            admin.setNombre(teclado.next());
            System.out.println("Ingrese su DNI:");
            admin.setDni(teclado.next());
            System.out.println("Ingrese su nombre de usuario:");
            admin.setUsuario(teclado.next());
            System.out.println("Ingrese su contrasena:");
            admin.setContrasenia(teclado.next());
            System.out.println("Indique su ID de administrador:");
            admin.setIdAdmin(teclado.nextInt());
            
			cargarUsuarioJSON(admin);

		} else if (rol == 3) {
			Conserje conserje = new Conserje();
			// Cargar todos los datos de usuario y conserje
			System.out.println("Ingrese su nombre completo:");
            conserje.setNombre(teclado.next());
            System.out.println("Ingrese su DNI:");
            conserje.setDni(teclado.next());
            System.out.println("Ingrese su nombre de usuario:");
            conserje.setUsuario(teclado.next());
            System.out.println("Ingrese su contrasena:");
            conserje.setContrasenia(teclado.next());
            System.out.println("Indique su ID de conserje");
            conserje.setidConserje(teclado.nextInt());
            System.out.println("Indique su turno:");
            conserje.setTurno(teclado.next());
			cargarUsuarioJSON(conserje);

		} else {
			System.out.println("Tipo de rol inexistente");
		}

		System.out.println("Cuenta creada exitosamente");
	}

	public static void cargarUsuarioJSON(Usuario user) {
		try {
			JSONArray usuarios = new JSONArray(manejoJson.JsonUtilesUsuarios.leer("usuarios.json"));
			try {
				JSONObject usuario = new JSONObject();
				usuario.put("nombre", user.getNombre());
				// Cargar resto de los datos de usuario
				usuario.put("dni", user.getDni());
				usuario.put("usuario", user.getUsuario());
				usuario.put("contrasenia", user.getContrasenia());
				usuario.put("Tipo de usuario", user.getTipoDeUsuario());
				usuarios.put(usuario);
				manejoJson.JsonUtilesUsuarios.grabar(usuarios);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
