package manejoJson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CargaHabitaciones {
	
	public static void main(String[] args) {
	
	JSONArray habitaciones = new JSONArray();
	
	JSONObject habitacion1 = new JSONObject();
	JSONObject habitacion2 = new JSONObject();
	JSONObject habitacion3 = new JSONObject();
	JSONObject habitacion4 = new JSONObject();
	JSONObject habitacion11 = new JSONObject();
	JSONObject habitacion12 = new JSONObject();
	JSONObject habitacion13 = new JSONObject();
	JSONObject habitacion14 = new JSONObject();
	JSONObject habitacion21 = new JSONObject();
	JSONObject habitacion22 = new JSONObject();
	JSONObject habitacion23 = new JSONObject();
	JSONObject habitacion24 = new JSONObject();
	
	try {
	
	habitacion1.put("Numero", 1);
	habitacion1.put("Tipo", "Base Simple");
	habitacion1.put("Precio", 35.50);
	habitacion1.put("Plazas", 4);
	habitacion1.put("Categoria", "Estandar");
	habitacion1.put("Planta", 0);

	habitacion2.put("Numero", 2);
	habitacion2.put("Tipo", "Base Simple");
	habitacion2.put("Precio", 38.50);
	habitacion2.put("Plazas", 5);
	habitacion2.put("Categoria", "Estandar");
	habitacion2.put("Planta", 0);

	habitacion3.put("Numero", 3);
	habitacion3.put("Tipo", "Base Doble");
	habitacion3.put("Precio", 43.50);
	habitacion3.put("Plazas", 2);
	habitacion3.put("Categoria", "Confort");
	habitacion3.put("Planta", 0);
	
	habitacion4.put("Numero", 4);
	habitacion4.put("Tipo", "Base Doble");
	habitacion4.put("Precio", 43.50);
	habitacion4.put("Plazas", 2);
	habitacion4.put("Categoria", "Confort");
	habitacion4.put("Planta", 0);
	
	habitacion11.put("Numero", 11);
	habitacion11.put("Tipo", "Base Simple");
	habitacion11.put("Precio", 35.50);
	habitacion11.put("Plazas", 4);
	habitacion11.put("Categoria", "Estandar");
	habitacion11.put("Planta", 1);
	
	habitacion12.put("Numero", 12);
	habitacion12.put("Tipo", "Base Simple");
	habitacion12.put("Precio", 35.50);
	habitacion12.put("Plazas", 4);
	habitacion12.put("Categoria", "Estandar");
	habitacion12.put("Planta", 1);
	
	habitacion13.put("Numero", 13);
	habitacion13.put("Tipo", "Base Simple");
	habitacion13.put("Precio", 44.00);
	habitacion13.put("Plazas", 3);
	habitacion13.put("Categoria", "Confort");
	habitacion13.put("Planta", 1);
	
	habitacion14.put("Numero", 14);
	habitacion14.put("Tipo", "Base Simple");
	habitacion14.put("Precio", 53.50);
	habitacion14.put("Plazas", 2);
	habitacion14.put("Categoria", "Premium");
	habitacion14.put("Planta", 1);
	
	habitacion21.put("Numero", 21);
	habitacion21.put("Tipo", "Base Simple");
	habitacion21.put("Precio", 45.50);
	habitacion21.put("Plazas", 4);
	habitacion21.put("Categoria", "Confort");
	habitacion21.put("Planta", 2);
	
	habitacion22.put("Numero", 22);
	habitacion22.put("Tipo", "Base Doble");
	habitacion22.put("Precio", 53.50);
	habitacion22.put("Plazas", 2);
	habitacion22.put("Categoria", "Premium");
	habitacion22.put("Planta", 2);
	
	habitacion23.put("Numero", 23);
	habitacion23.put("Tipo", "Base Doble");
	habitacion23.put("Precio", 53.50);
	habitacion23.put("Plazas", 2);
	habitacion23.put("Categoria", "Premium");
	habitacion23.put("Planta", 2);
	
	habitacion24.put("Numero", 24);
	habitacion24.put("Tipo", "Base Doble");
	habitacion24.put("Precio", 54.00);
	habitacion24.put("Plazas", 3);
	habitacion24.put("Categoria", "Premium");
	habitacion24.put("Planta", 2);
			
	
	habitaciones.put(habitacion1);
	habitaciones.put(habitacion2);
	habitaciones.put(habitacion3);
	habitaciones.put(habitacion4);
	habitaciones.put(habitacion11);
	habitaciones.put(habitacion12);
	habitaciones.put(habitacion13);
	habitaciones.put(habitacion14);
	habitaciones.put(habitacion21);
	habitaciones.put(habitacion22);
	habitaciones.put(habitacion23);
	habitaciones.put(habitacion24);
	
	JsonUtilesHabitaciones.grabar(habitaciones);

	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

