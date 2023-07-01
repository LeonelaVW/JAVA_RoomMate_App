package clases;
import interfaces.I_funcionesInternas;

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
	
	//eliminar habitación
	
	//asignar permisos (podría ser cambiar tipo de cuenta de usuario)

}
