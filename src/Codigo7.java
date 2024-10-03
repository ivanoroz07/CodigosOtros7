//Se ingresa un país y te devuelve la capital si no la conoce te la pide

import java.util.HashMap;//Se importo HashMap
import java.util.Scanner;//Se importo scanner

public class Codigo7 {

	public static void main(String[] args) {//se agrego main
		Scanner s = new Scanner(System.in);//se agrega System.in

	    HashMap<String, String> capitales = new HashMap<>();//Se cambian los valores a String
	    //y se corrige ca a capitales

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador", "San salvador");//se agrega capital
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    String c = "";//se agrega la r
	    do {
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");//se cambia in por out
	      c = s.nextLine();//se cambia a Line
	      
	      if (!c.equals("salir")) {//se agrego s
	        if (capitales.containsKey(c)) {//se midfica a capitales y se cambia de values a key
	          System.out.print("La capital de " + c);//se agrega out.
	          System.out.println(" es " + capitales.get(c));//se midfica a capitales y put a get
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          capitales.put(c, ca);//se midfica ca a capitales
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!c.equals("salir"));//se agrega h a wile
	    s.close();//se cierra scanner
	  }


	}


