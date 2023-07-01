package clases;
import interfaces.I_funcionesInternas;

public class Conserje extends Usuario{
	
	//Atributos propios
	private int idConserje;
	private String turno;
	
	//Constructor de la clase abstracta + atributos propios
	public Conserje(String nombre, int dni, String usuario, String contrasenia, String tipoDeUsuario, int idConserje, String turno) {
		super(nombre, dni, usuario, contrasenia, tipoDeUsuario);
		// TODO Auto-generated constructor stub
		this.idConserje = idConserje;
		this.turno = turno;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return idConserje;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.idConserje = id;
	}

	/**
	 * @return the turno
	 */
	public String getTurno() {
		return turno;
	}

	/**
	 * @param turno the turno to set
	 */
	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Conserje [idConserje=" + idConserje + ", turno=" + turno + ", getNombre()=" + getNombre() + ", getDni()=" + getDni()
				+ ", getUsuario()=" + getUsuario() + ", getContrasenia()=" + getContrasenia() + "]";
	}

	//Métodos propios
	
	//atender pasajeros
	
	
	

}
