package paquete;

import java.util.Scanner;

public class Proyecto15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String nombre=sc.nextLine();
		String nombreMayuscula = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
		
		System.out.println("Dime tu apellido: ");
		String apellido=sc.nextLine();
		String apellidoMayuscula = apellido.toUpperCase().charAt(0) + apellido.substring(1, apellido.length()).toLowerCase();
		
		String nombreCompleto = nombreMayuscula+apellidoMayuscula;
		
		String libro = texto.texto();
		
		int buscaPalabra = libro.indexOf(nombreCompleto);
		
		System.out.println(buscaPalabra); 
		
		System.out.println(texto.substring(10685,10700));
		
		
		
		
		
	}

}
