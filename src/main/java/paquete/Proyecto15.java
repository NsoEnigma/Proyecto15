package paquete;

import java.util.Scanner;

/**
 *Esta clase contiene distintas variables que sirven para localizar la palabra asignada segun nuestro nombre. 
 * @author: Alejandro Asencio
 * @version: 12/12/2021
 *
 */

public class Proyecto15 {
	
	/**
	 * Método que genera un numero determinado de caracteres dependiendo de nuestro nombre y la localizacion del mismo
	 * @param args El parametro args define los continuos elementos que utilizamos para localizar esta palabra
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String nombre=sc.nextLine();
		String nombreMayuscula = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
		
		System.out.println("Dime tu apellido: ");
		String apellido=sc.nextLine();
		String apellidoMayuscula = apellido.toUpperCase().charAt(0) + apellido.substring(1, apellido.length()).toLowerCase();
		
		String nombreCompleto = nombreMayuscula+apellidoMayuscula;
		
		String libro = Texto.texto();
		
		int buscaPalabra = libro.indexOf(nombreCompleto);
		
		System.out.println(libro.substring(buscaPalabra,buscaPalabra+nombreCompleto.length()+2));
		
		String numeroAtras =  libro.substring(buscaPalabra+(nombreCompleto.length()+1),buscaPalabra+nombreCompleto.length()+2);
		
		System.out.println(numeroAtras);
		
		int numero = Integer.parseInt(numeroAtras);
		
		
		String palabra = libro.substring(buscaPalabra+(nombreCompleto.length()+2),buscaPalabra+(nombreCompleto.length()+2)+numero);
		
		System.out.println(palabra);	
		
	}

}
