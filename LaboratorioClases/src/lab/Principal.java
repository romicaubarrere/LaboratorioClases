package lab;
// creamos clase persona y mostramos los atributos de los objetos
import java.util.Scanner; 

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in); //scanner es una clase que ya viene creada
       //nombreClase-nombreObjeto- operador new q genera espacio de memoria para el objeto y el constructor Scanner (System.in)
	// el cosntructor se llama igual que la clase y entre parentesis pongo si el constructor recibe o no recibe parametros
		
		Persona p1 = new Persona (); //no recibe parametros
		p1.setCedula(1234567); //el punto marca la direccion, p1 es el objeto que dentro tiene los atributos
		p1.setNombre("Pepe");
		p1.setApellido("Lopez");
		// p1.nombre = "Pepe";
		// p1.apellido= "Lopez";
		
		Persona p2 = new Persona (2345678, "Luis", "Suarez"); {
		}
		
		p2.setCedula(223423); //para cambiar el valorS
		
		System.out.println("La cedula es: " + p1.getCedula());
		System.out.println("El nombre es: " + p1.getNombre());
		System.out.println("El apellido es: " + p1.getApellido());
		System.out.println(p2.toString ()); // el metodo toString hace q se vea bien
		
		//AL ESTAR COMO PRIVADOS ME APARECEN EN ROJO, NO PUEDO ACCEDER A ELLOS
		
		
		Mascota m1 = new Mascota ("Perro", "Firulais", 34, p2);
			System.out.println(m1);
}
	}
