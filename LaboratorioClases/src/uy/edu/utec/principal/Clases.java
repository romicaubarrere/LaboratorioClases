package uy.edu.utec.principal;

import uy.edu.utec.clases.Mascota;
import uy.edu.utec.clases.Persona;

public class Clases {
	public static void main(String[] args) {
		Persona persona1 = new Persona("12345678","Juan","Perez");
		Persona persona2 = new Persona("23456789","Maria","Gonzalez");
		
		Mascota mascota1 = new Mascota("pepito", "perro", 12, persona1);
		Mascota mascota2 = new Mascota("lala", "gato", 5, persona1);
		Mascota mascota3 = new Mascota("floppy", "canario", 1, persona2);
		
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(mascota1);
		System.out.println(mascota2);
		System.out.println(mascota3);
		
		System.out.println("Alimentación de "+mascota1.getNombre()+" es "+ mascota1.alimentacion());
		System.out.println("Alimentación de "+mascota2.getNombre()+" es "+ mascota2.alimentacion());
		System.out.println("Alimentación de "+mascota3.getNombre()+" es "+ mascota3.alimentacion());
		
	}
}
