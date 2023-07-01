package clases;

public class CategoriaHabitacion {
//Atributos 
	private boolean baseSimple;
	private String tipoHabitacion; 
	
	//Constructor
	/**
	 * @param baseSimple
	 * @param tipoHabitacion
	 */
	public CategoriaHabitacion(boolean baseSimple, String tipoHabitacion) {
		super();
		this.baseSimple = baseSimple;
		this.tipoHabitacion = tipoHabitacion;
	}
	//Metodos

	/**
	 * @return the baseSimple
	 */
	public boolean isBaseSimple() {
		return baseSimple;
	}

	
	

	/**
	 * @return the tipoHabitacion
	 */
	public String getTipoHabitacion() {
		return tipoHabitacion;
	}


	
	
	
	
}
