package main;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import manejoJson.JsonUtilesHabitaciones;

public class App {

	public static void main(String[] args) {
		
		JSONArray conserjes = new JSONArray();
		
		JSONObject conserje1 = new JSONObject();
		JSONObject conserje2 = new JSONObject();
		JSONObject conserje3 = new JSONObject();
		
		try {
			
					
			conserje1.put("Id", 1);
			conserje1.put("Turno", "Matutino");
			
			conserje2.put("Id", 2);
			conserje2.put("Turno", "Vespertino");
			
			conserje3.put("Id", 3);
			conserje3.put("Turno", "Nocturno");
			
			
			conserjes.put(conserje1);
			conserjes.put(conserje2);
			conserjes.put(conserje3);
			
			JsonUtilesHabitaciones.grabar(conserjes);
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
