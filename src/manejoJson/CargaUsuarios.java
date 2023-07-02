package manejoJson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CargaUsuarios {
	
	public static void main(String[] args) {
	
	JSONArray usuarios = new JSONArray();
	
	JSONObject usuario1 = new JSONObject();
	JSONObject usuario2 = new JSONObject();
	JSONObject usuario3 = new JSONObject();
	JSONObject usuario4 = new JSONObject();
	JSONObject usuario5 = new JSONObject();
	JSONObject usuario6 = new JSONObject();
	JSONObject usuario7 = new JSONObject();
	JSONObject usuario8 = new JSONObject();
	JSONObject usuario9 = new JSONObject();
	JSONObject usuario10 = new JSONObject();
	JSONObject usuario11 = new JSONObject();
	JSONObject usuario12 = new JSONObject();
	JSONObject usuario13 = new JSONObject();
	JSONObject usuario14 = new JSONObject();
	JSONObject usuario15 = new JSONObject();

	
	try {
	
	usuario1.put("Nombre", "Verino, Leonela");
	usuario2.put("DNI", 34850159);
	usuario3.put("Usuario", "leonelaverino");
	usuario4.put("Contrasenia", "leonela3485");
	usuario5.put("Tipo", "Administrador");

	usuario2.put("Nombre", "Tapia, Mariano");
	usuario2.put("DNI", 45150799);
	usuario2.put("Usuario", "marianotapia");
	usuario2.put("Contrasenia", "mariano4515");
	usuario2.put("Tipo", "Administrador");

	usuario3.put("Nombre", "Genez, Tomas");
	usuario3.put("DNI", 36240121 );
	usuario3.put("Usuario", "tomasgenez");
	usuario3.put("Contrasenia", "tomas3624");
	usuario3.put("Tipo", "Administrador");
	
	usuario4.put("Nombre", "Caivano, Duilio Orlando");
	usuario4.put("DNI", 13653762);
	usuario4.put("Usuario", "duiliocaivano");
	usuario4.put("Contrasenia", "duilio1365");
	usuario4.put("Tipo", "Pasajero");
	
	usuario5.put("Nombre", "Bianchi, Martin");
	usuario5.put("DNI", 33225141);
	usuario5.put("Usuario", "martinbianchi");
	usuario5.put("Contrasenia", "martin3322");
	usuario5.put("Tipo", "Conserje");
	
	usuario6.put("Nombre", "Farace, Maria del Carmen");
	usuario6.put("DNI", 20985665);
	usuario6.put("Usuario", "mariafarace");
	usuario6.put("Contrasenia", "maria2098");
	usuario6.put("Tipo", "Pasajero");
	
	usuario7.put("Nombre", "Catalan, Ruben Dario");
	usuario7.put("DNI", 17804579);
	usuario7.put("Usuario", "rubencatalan");
	usuario7.put("Contrasenia", "ruben1780");
	usuario7.put("Tipo", "Pasajero");
	
	usuario8.put("Nombre", "Mastrangelo, Crescencio");
	usuario8.put("DNI", 17444777);
	usuario8.put("Usuario", "crescenciomastrangelo");
	usuario8.put("Contrasenia", "crescencio1744");
	usuario8.put("Tipo", "Pasajero");
	
	usuario9.put("Nombre", "Mora, Enzo Alberto");
	usuario9.put("DNI", 10626748);
	usuario9.put("Usuario", "enzomora");
	usuario9.put("Contrasenia", "enzo1062");
	usuario9.put("Tipo", "Pasajero");
	
	usuario10.put("Nombre", "Rodriguez Rendon, Juan Manuel");
	usuario10.put("DNI", 35206976);
	usuario10.put("Usuario", "juanrodrgiuez");
	usuario10.put("Contrasenia", "juan3520");
	usuario10.put("Tipo", "Conserje");
	
	usuario11.put("Nombre", "Ali, Jose Luis");
	usuario11.put("DNI", 12439270);
	usuario11.put("Usuario", "joseali");
	usuario11.put("Contrasenia", "jose1243");
	usuario11.put("Tipo", "Pasajero");

	usuario12.put("Nombre", "Almejun, Maria Agustina");
	usuario12.put("DNI", 31091124);
	usuario12.put("Usuario", "mariaalmejun");
	usuario12.put("Contrasenia", "maria3109");
	usuario12.put("Tipo", "Pasajero");

	
	usuario13.put("Nombre", "Passadore, Maria Eugenia");
	usuario13.put("DNI", 31910839);
	usuario13.put("Usuario", "mariapassadore");
	usuario13.put("Contrasenia", "maria3191");
	usuario13.put("Tipo", "Pasajero");
	
	usuario14.put("Nombre", "Barrera, Anuar Moises");
	usuario14.put("DNI", 32159755);
	usuario14.put("Usuario", "anuarbarrera");
	usuario14.put("Contrasenia", "anuar3215");
	usuario14.put("Tipo", "Conserje");
	
	usuario15.put("Nombre", "Russo, Rosana");
	usuario15.put("DNI", 12130424);
	usuario15.put("Usuario", "rosanarusso");
	usuario15.put("Contrasenia", "rosana1213");
	usuario15.put("Tipo", "Pasajero");
	
	
	usuarios.put(usuario1);
	usuarios.put(usuario2);
	usuarios.put(usuario3);
	usuarios.put(usuario4);
	usuarios.put(usuario5);
	usuarios.put(usuario6);
	usuarios.put(usuario7);
	usuarios.put(usuario8);
	usuarios.put(usuario9);
	usuarios.put(usuario10);
	usuarios.put(usuario11);
	usuarios.put(usuario12);
	usuarios.put(usuario13);
	usuarios.put(usuario14);
	usuarios.put(usuario15);

	
	JsonUtilesUsuarios.grabar(usuarios);

	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

