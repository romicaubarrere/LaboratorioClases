package lab;

public class Persona {

	/*
	int cedula;
	String nombre;
	String apellido;
	*/
	
	// DEFINO COMO PRIVADO
	
	private int cedula;
	private String nombre;
	private String apellido;
	
	//VOY A UTILIZAE EL METODO GET PARA OBTENER LOS DATOS Y EL METODO SET PARA DEFINIR LOS DATOS
	
	// Los metodos siempre son publicos
	
	public void setCedula (int cedula) { //puedo o no ponerle parametros
	//cuerpo del metodo, va lo que yo quiero que haga
	// no quiero que devuelva nada porque esun metodo de entrada, no de salida
		this.cedula = cedula; //this hace referencia a la variable que esta definida en la clase
	}

	public int getCedula() {
		return cedula; //me va a devolver la variable cedula
	}
	
	public void setNombre (String nombre){ 
	this.nombre = nombre;
}
	public String getNombre() {
		return 	nombre;
	}
	public void setApellido (String apellido){ 
		this.apellido = apellido;
	}
	public String getApellido() {
			return apellido;
	}
	
	public Persona (int cedula, String nombre, String apellido) { //el constructor es un set que recibe todos los parametros
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	//para mantener un constructor vacio lo tengo que crear
	public Persona () {
	
}
	
	// voy a hacer un metodo que me pasa todos los atributos a string == Source/ Generate toString()

	@Override
	public String toString() {// da un return que concatena todo, el nombre de la clase, el nombre del atributo, el valor
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	

}