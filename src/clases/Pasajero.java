package clases;

public class Pasajero extends Usuario{
	
	//Atributos propios
	private String ciudadDeOrigen;
	private String domicilioDeOrigen;
	
	
	//Constructor de la clase abstracta + atributos propios
	public Pasajero(String nombre, int dni, String usuario, String contrasenia, String tipoDeUsuario, String ciudadDeOrigen, String domicilioDeOrigen) {
		super(nombre, dni, usuario, contrasenia, tipoDeUsuario);
		// TODO Auto-generated constructor stub
		this.ciudadDeOrigen = ciudadDeOrigen;
		this.domicilioDeOrigen = domicilioDeOrigen;
		
	}

	public Pasajero() {
		super();
	}

	//Getters y setters

	/**
	 * @return the ciudadDeOrigen
	 */
	public String getCiudadDeOrigen() {
		return ciudadDeOrigen;
	}


	/**
	 * @param ciudadDeOrigen the ciudadDeOrigen to set
	 */
	public void setCiudadDeOrigen(String ciudadDeOrigen) {
		this.ciudadDeOrigen = ciudadDeOrigen;
	}


	/**
	 * @return the domicilioDeOrigen
	 */
	public String getDomicilioDeOrigen() {
		return domicilioDeOrigen;
	}


	/**
	 * @param domicilioDeOrigen the domicilioDeOrigen to set
	 */
	public void setDomicilioDeOrigen(String domicilioDeOrigen) {
		this.domicilioDeOrigen = domicilioDeOrigen;
	}


	@Override
	public String toString() {
		return "Pasajero [ciudadDeOrigen=" + ciudadDeOrigen + ", domicilioDeOrigen=" + domicilioDeOrigen
				+ ", toString()=" + super.toString() + "]";
	}
	
	


	
	
	

}
