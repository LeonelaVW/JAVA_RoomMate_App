package main;
import java.util.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import clases.Hotel1;
import manejoJson.*;

public class App {

	public static void main(String[] args) {
		
		Hotel1 hotel = new Hotel1();
		Scanner teclado = new Scanner(System.in);
		Hotel1.teclado = new Scanner(System.in);
		Hotel1.mostrarMenuPrincipal(teclado);
		System.out.println(manejoJson.JsonUtilesUsuarios.leer("usuarios.json"));
		
		
		
	}
		/*
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
*/
}
