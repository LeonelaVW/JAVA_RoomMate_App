package clases;
import org.json.*;
import java.util.*;
public abstract class Usuario {

	//Atributos de la superclase
	private String nombre;
	private int dni;
	private String usuario;
	private String contrasenia;
	private String tipoDeUsuario;
	private JSONArray usuarios;
	
	//Constructor usando campos
	/**
	 * @param nombre
	 * @param dni
	 * @param usuario
	 * @param contrasenia
	 * @param tipoDeUsuario
	 */
	public Usuario(String nombre, int dni, String usuario, String contrasenia, String tipoDeUsuario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.tipoDeUsuario = tipoDeUsuario;
	}
	
	

	public Usuario() {
		super();
	}



	//Getters y setters

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String string) {
		this.nombre = nombre;
	}


	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String string) {
		this.dni = dni;
	}


	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}


	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String string) {
		this.usuario = usuario;
	}


	/**
	 * @return the contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}


	/**
	 * @param contrasenia the contrasenia to set
	 */
	public void setContrasenia(String string) {
		this.contrasenia = contrasenia;
	}


	/**
	 * @return the tipoDeUsuario
	 */
	public String getTipoDeUsuario() {
		return tipoDeUsuario;
	}


	/**
	 * @param tipoDeUsuario the tipoDeUsuario to set
	 */
	public void setTipoDeUsuario(String tipoDeUsuario) {
		this.tipoDeUsuario = tipoDeUsuario;
	}
	
	//Método toString  (modificar)

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", dni=" + dni + ", usuario=" + usuario + ", contrasenia=" + contrasenia
				+ ", tipoDeUsuario=" + tipoDeUsuario + "]";
	}
	
	
	//Metodos

    public String obtenerRolUsuario(String nombreUsuario) {
        for (int i = 0; i < usuarios.length(); i++) {
            JSONObject usuario = null;
			try {
				usuario = usuarios.getJSONObject(i);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            try {
				if (usuario.getString("nombreUsuario").equals(nombreUsuario)) {
				    return usuario.getString("rol");
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return null;
    }
	

	
}
