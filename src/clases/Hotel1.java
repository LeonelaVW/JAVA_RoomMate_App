package clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner; 
import manejoJson.JsonUtilesHabitaciones;
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
		this.teclado = new Scanner(System.in);
	}
	
	
	public static void mostrarMenuPrincipal() {

		System.out.println("------- Menu Principal -------");
		System.out.println("1. Crear cuenta");
		System.out.println("2. Ingresar cuenta");
		System.out.println("0. Salir");

		int opcion = teclado.nextInt();

		switch (opcion) {
		case 1://crear cuenta
			System.out.println("Que rol quiere registrar?\n1- Pasajero\n2-Administrador\n3-Conserje");
			int rol = teclado.nextInt();
			crearCuenta(rol);
			break;
		case 2://Ingresar cuenta
        	System.out.println("Que rol quiere registrar?\n1- Pasajero\n2-Administrador\n3-Conserje");
        	int rol1=teclado.nextInt();
			ingresarCuenta(rol1);
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
	            System.out.println(pasajero.getNombre());
	            System.out.println("Ingrese su DNI:");
	            pasajero.setDni(teclado.nextInt());
	            System.out.println("Ingrese su nombre de usuario:");
	            pasajero.setUsuario(teclado.next());
	            System.out.println("Ingrese su contrasena:");
	            pasajero.setContrasenia(teclado.next());
	            System.out.println("Indique su ciudad de origen");
	            ((Pasajero) pasajero).setCiudadDeOrigen(teclado.next());
	            System.out.println("Indique su domicilio legal");
	            ((Pasajero) pasajero).setDomicilioDeOrigen(teclado.next());
	            
	            System.out.println(pasajero.toString());
			cargarUsuarioJSON(pasajero);

		} else if (rol == 2) {
			Administrador admin = new Administrador();
			// Cargar todos los datos de usuario y admin
			System.out.println("Ingrese su nombre completo:");
            admin.setNombre(teclado.next());
            System.out.println("Ingrese su DNI:");
            admin.setDni(teclado.nextInt());
            System.out.println("Ingrese su nombre de usuario:");
            admin.setUsuario(teclado.next());
            System.out.println("Ingrese su contrasena:");
            admin.setContrasenia(teclado.next());
            System.out.println("Indique su ID de administrador:");
            admin.setIdAdmin(teclado.nextInt());
            System.out.println(admin.toString());
			cargarUsuarioJSON(admin);

		} else if (rol == 3) {
			Conserje conserje = new Conserje();
			// Cargar todos los datos de usuario y conserje
			System.out.println("Ingrese su nombre completo:");
            conserje.setNombre(teclado.next());
            System.out.println("Ingrese su DNI:");
            conserje.setDni(teclado.nextInt());
            System.out.println("Ingrese su nombre de usuario:");
            conserje.setUsuario(teclado.next());
            System.out.println("Ingrese su contrasena:");
            conserje.setContrasenia(teclado.next());
            
            Conserje conserje1=(Conserje) conserje;
            System.out.println("Indique su ID de conserje");
            conserje1.setidConserje(teclado.nextInt());
            System.out.println("Indique su turno:");
            conserje1.setTurno(teclado.next());
			cargarUsuarioJSON(conserje);

		} else {
			System.out.println("Tipo de rol inexistente");
		}

		System.out.println("Cuenta creada exitosamente");
	}
	public static void ingresarCuenta(int rol1) {

		if (rol1 == 1) {
			//Pasajero

	       System.out.println("Ingrese su nombre de usuario:");
	       String usuario=teclado.next();
	       System.out.println("Ingrese su contrasenia:");
	       String contrasenia=teclado.next();

	        try {
	            // Lee el contenido del archivo JSON
	            String jsonContent = new String(Files.readAllBytes(Paths.get("pasajeros.json")));

	            // Convierte el contenido a un objeto JSON
	           
				try {
					JSONArray jsonArray = new JSONArray(jsonContent);

		            // Recorre el JSON
		            for (int i = 0; i < jsonArray.length(); i++) {
		                JSONObject pasajeroObj = jsonArray.getJSONObject(i);
		                String usuarioJson = pasajeroObj.getString("usuario");
		                String contraseniaJson = pasajeroObj.getString("contrasenia");

		                // Compara los valores con los ingresados por el usuario
		                if (usuario.equals(usuarioJson) && contrasenia.equals(contraseniaJson)) {
		                    System.out.println("Inicio de sesion exitoso!");
		                    mostrarMenuPasajero();
		                    return;
		                }
		            }

		            // Si no se encuentra una coincidencia
		            System.out.println("Usuario y/o contrasenia incorrectos.");
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    

		} else if (rol1 == 2) {
			Administrador admin = new Administrador();
				//administrador

		       System.out.println("Ingrese su nombre de usuario:");
		       String usuario=teclado.next();
		       System.out.println("Ingrese su contrasenia:");
		       String contrasenia=teclado.next();

		        try {
		            // Lee el contenido del archivo JSON
		            String jsonContent = new String(Files.readAllBytes(Paths.get("administradores.json")));

		            // Convierte el contenido a un objeto JSON
		           
					try {
						JSONArray jsonArray = new JSONArray(jsonContent);

			            // Recorre el JSON
			            for (int i = 0; i < jsonArray.length(); i++) {
			                JSONObject pasajeroObj = jsonArray.getJSONObject(i);
			                String usuarioJson = pasajeroObj.getString("usuario");
			                String contraseniaJson = pasajeroObj.getString("contrasenia");

			                // Compara los valores con los ingresados por el usuario
			                if (usuario.equals(usuarioJson) && contrasenia.equals(contraseniaJson)) {
			                    System.out.println("Inicio de sesion exitoso!");
			                    mostrarMenuAdministrador();
			                    return;
			                }
			            }

			            // Si no se encuentra una coincidencia
			            System.out.println("Usuario y/o contrasenia incorrectos.");
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


		        } catch (IOException e) {
		            e.printStackTrace();
		        }


		} else if (rol1 == 3) {
			Conserje conserje = new Conserje();
			   System.out.println("Ingrese su nombre de usuario:");
		       String usuario=teclado.next();
		       System.out.println("Ingrese su contrasenia:");
		       String contrasenia=teclado.next();

		        try {
		            // Lee el contenido del archivo JSON
		            String jsonContent = new String(Files.readAllBytes(Paths.get("conserjes.json")));

		            // Convierte el contenido a un objeto JSON
		           
					try {
						JSONArray jsonArray = new JSONArray(jsonContent);

			            // Recorre el JSON
			            for (int i = 0; i < jsonArray.length(); i++) {
			                JSONObject pasajeroObj = jsonArray.getJSONObject(i);
			                String usuarioJson = pasajeroObj.getString("usuario");
			                String contraseniaJson = pasajeroObj.getString("contrasenia");

			                // Compara los valores con los ingresados por el usuario
			                if (usuario.equals(usuarioJson) && contrasenia.equals(contraseniaJson)) {
			                    System.out.println("Inicio de sesion exitoso!");
			                    mostrarMenuConserje();
			                    return;
			                }
			            }

			            // Si no se encuentra una coincidencia
			            System.out.println("Usuario y/o contrasenia incorrectos.");
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		} else {
			System.out.println("Tipo de rol inexistente");
		}


	}

	
	
	
public static void cargarUsuarioJSON(Pasajero user) {
		
		
		JSONArray pasajeros = new JSONArray();
		try {
			JSONObject usuario = new JSONObject();
			usuario.put("nombre", user.getNombre());
			// Cargar resto de los datos de usuario
			usuario.put("dni", user.getDni());
			usuario.put("usuario", user.getUsuario());
			usuario.put("contrasenia", user.getContrasenia());
			usuario.put("Tipo de usuario", user.getTipoDeUsuario());
			usuario.put("Ciudad de origen", user.getCiudadDeOrigen());
			usuario.put("Domicilio de origen", user.getDomicilioDeOrigen());
			pasajeros.put(usuario);
			manejoJson.JsonUtilesPasajeros.grabar(pasajeros);;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
public static void cargarUsuarioJSON(Administrador user) {
	

	JSONArray administradores = new JSONArray();
	try {
		JSONObject usuario = new JSONObject();
		usuario.put("nombre", user.getNombre());
		// Cargar resto de los datos de usuario
		usuario.put("dni", user.getDni());
		usuario.put("usuario", user.getUsuario());
		usuario.put("contrasenia", user.getContrasenia());
		usuario.put("Tipo de usuario", user.getTipoDeUsuario());
		usuario.put("Ingrese su Id de Admin", user.getIdAdmin());
		administradores.put(usuario);
		manejoJson.JsonUtilesAdministrador.grabar(administradores);;;
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static void cargarUsuarioJSON(Conserje user) {
	
	
	JSONArray conserjes = new JSONArray();
	try {
		JSONObject usuario = new JSONObject();
		usuario.put("nombre", user.getNombre());
		// Cargar resto de los datos de usuario
		usuario.put("dni", user.getDni());
		usuario.put("usuario", user.getUsuario());
		usuario.put("contrasenia", user.getContrasenia());
		usuario.put("Tipo de usuario", user.getTipoDeUsuario());
		usuario.put("Ingrese su Id de conserje", user.getidConserje());
		usuario.put("Ingrese su turno", user.getTurno());
		conserjes.put(usuario);
		manejoJson.JsonUtilesConserje.grabar(conserjes);;
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

public static void cargarReservaJSON(Habitacion reserva ) {
	JSONArray reservas = new JSONArray();
	JSONObject reserva1 = new JSONObject();
	
	try {
		reserva1.put("Numero",reserva.getNumero());
		reservas.put(reserva1);
		manejoJson.JsonUtilesReservas.grabar(reservas);
	} catch (JSONException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
public static void mostrarMenuAdministrador() {
    System.out.println("Bienvenido, Administrador");
    System.out.println("1. Agregar usuario");
    System.out.println("2. Agregar habitacion");
    System.out.println("0. Salir");
    
    int opcion = teclado.nextInt();

	switch (opcion) {
	case 1://crear cuenta
		System.out.println("Que rol quiere registrar?\\n1- Pasajero\\n2-Administrador\\n3-Conserje");
		int rol2=teclado.nextInt();
		if (rol2 == 1) 
crearCuenta(rol2);
		else if (rol2==2){
			crearCuenta(rol2);
			
		}else if (rol2==3){
			crearCuenta(rol2);
		}
break;
	case 2://Agregar habitacion
		Habitacion habitacion1 = new Habitacion();
		Scanner teclado = new Scanner(System.in);
		// Cargar todos los datos de usuario y conserje
		System.out.println("Ingrese el numero de la habitacion:");
        habitacion1.setNumero(teclado.nextInt());
        System.out.println("Ingrese el estado:");
        habitacion1.setEstado(teclado.next());
        System.out.println("Ingrese el motivo de no disponibilidad:");
        habitacion1.setMotivoNoDisponibilidad(teclado.next());
        System.out.println("Ingrese el precio:");
        habitacion1.setPrecio(teclado.nextDouble());
        cargarHabitacionJSON(habitacion1);
        System.out.println("La habitacion ha sido cargada exitosamente");
        break;
	case 0:
		System.out.println("Gracias por utilizar nuestro servicio, hasta pronto!");
		break;
	default:
		System.out.println("Opcion invalida. Intente nuevamente.");
		break;
	
	}
	

}

	public static void cargarHabitacionJSON(Habitacion user) {
		
		
		JSONArray habitaciones = new JSONArray();
		try {
			JSONObject usuario = new JSONObject();
			usuario.put("Numero", user.getNumero());
			// Cargar resto de los datos de usuario
			usuario.put("Precio", user.getPrecio());
			usuario.put("Estado", user.getEstado());
			usuario.put("Tipo", user.getTipo());
			usuario.put("Motivo de no disponibilidad", user.getMotivoNoDisponibilidad());
			habitaciones.put(usuario);
			manejoJson.JsonUtilesHabitaciones.grabar(habitaciones);;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		}

		public static void mostrarMenuConserje() {
		    System.out.println("Bienvenido, Conserje");
		    System.out.println("1. Saludar");
		    System.out.println("2. Ver habitaciones disponibles");
		    System.out.println("3. Ver usuarios");
		    System.out.println("0. Salir");
		    
		    int opcion = teclado.nextInt();

			switch (opcion) {
			case 1://Saludar
				System.out.println("Hola bienvenido al Hotel Hermitage!");
				break;
			case 2:
				System.out.println("Habitaciones disponibles:");
			       try {
			            // Leer el archivo JSON y almacenarlo en una cadena de texto
			            String jsonString = new String(Files.readAllBytes(Paths.get("habitaciones.json")));

			            // Convertir la cadena JSON en un JSONArray
			            JSONArray jsonArray = new JSONArray(jsonString);

			            // Recorrer cada objeto del JSONArray y mostrar sus valores
			            for (int i = 0; i < jsonArray.length(); i++) {
			                JSONObject jsonObject = jsonArray.getJSONObject(i);
			                int numero = jsonObject.getInt("Numero");		              
			                System.out.println("Numero: " + numero);		              
			                System.out.println("--------------------");
			            }
			        } catch (IOException e) {
			            e.printStackTrace();
			        } catch (JSONException e) {
			            e.printStackTrace();
			        }
			    break;
			case 3:
				System.out.println("Usuarios:");
			       try {
			            // Leer el archivo JSON y almacenarlo en una cadena de texto
			            String jsonString = new String(Files.readAllBytes(Paths.get("usuarios.json")));

			            // Convertir la cadena JSON en un JSONArray
			            JSONArray jsonArray = new JSONArray(jsonString);

			            // Recorrer cada objeto del JSONArray y mostrar sus valores
			            for (int i = 0; i < jsonArray.length(); i++) {
			                JSONObject jsonObject = jsonArray.getJSONObject(i);
			                String nombre = jsonObject.getString("Nombre");	              
			                System.out.println("Nombre: " + nombre);	         
			                System.out.println("--------------------");
			            }
			        } catch (IOException e) {
			            e.printStackTrace();
			        } catch (JSONException e) {
			            e.printStackTrace();
			        }
			    break;
			case 0:
				System.out.println("Gracias por utilizar nuestro servicio, hasta pronto!");
				break;
			default:
				System.out.println("Opcion invalida. Intente nuevamente.");
				break;
		}}
		public static void mostrarMenuPasajero(){
			 System.out.println("Bienvenido, Pasajero");
			    System.out.println("1. Ver reservas hechas");
			    System.out.println("2. Ver habitaciones disponibles");
			    System.out.println("3. Reservar habitacion");
			    System.out.println("0. Salir");
			    
			    int opcion = teclado.nextInt();

				switch (opcion) {
				case 1://Ver reservas hechas
					System.out.println("Reservas hechas:");
				       try {
				            // Leer el archivo JSON y almacenarlo en una cadena de texto
				            String jsonString = new String(Files.readAllBytes(Paths.get("reservas.json")));

				            // Convertir la cadena JSON en un JSONArray
				            JSONArray jsonArray = new JSONArray(jsonString);

				            // Recorrer cada objeto del JSONArray y mostrar sus valores
				            for (int i = 0; i < jsonArray.length(); i++) {
				                JSONObject jsonObject = jsonArray.getJSONObject(i);
				                int numero = jsonObject.getInt("Numero");			
				                System.out.println("Numero: " + numero);			
				                System.out.println("--------------------");
				            }
				        } catch (IOException e) {
				            e.printStackTrace();
				        } catch (JSONException e) {
				            e.printStackTrace();
				        }
				    break;
				    
				case 2://habitaciones disponibles
					System.out.println("Habitaciones disponibles:");
				       try {
				            // Leer el archivo JSON y almacenarlo en una cadena de texto
				            String jsonString = new String(Files.readAllBytes(Paths.get("habitaciones.json")));

				            // Convertir la cadena JSON en un JSONArray
				            JSONArray jsonArray = new JSONArray(jsonString);

				            // Recorrer cada objeto del JSONArray y mostrar sus valores
				            for (int i = 0; i < jsonArray.length(); i++) {
				                JSONObject jsonObject = jsonArray.getJSONObject(i);
				                int numero = jsonObject.getInt("Numero");
				                System.out.println("Numero: " + numero);
				                System.out.println("--------------------");
				            }
				        } catch (IOException e) {
				            e.printStackTrace();
				        } catch (JSONException e) {
				            e.printStackTrace();
				        }
				    break;
				case 3:
					Habitacion reserva = new Habitacion();
					
					System.out.println("Ingrese el numero de la habitacion que desea reservar:");
			        reserva.setNumero(teclado.nextInt());
			        System.out.println("La habitacion ha sido reservada con exito");
						
						cargarReservaJSON(reserva);
						
					
		}


}
}
