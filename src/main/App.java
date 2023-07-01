package main;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class App {

	public static void main(String[] args) {
		
		JSONArray habitaciones = new JSONArray();
		
		JSONObject habitacion1 = new JSONObject();

		
		try {
			habitacion1.put("Numero de habitacion", 1);
			habitacion1.put("Tipo de habitacion", "BaseDoble");
			habitacion1.put("Estado", "Disponible");
			habitacion1.put("Motivo de no disponibilidad", "null");
			habitacion1.put("Precio", 35.50);
			habitacion1.put("Categoria", "Estandar");
			
			

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	}

}
