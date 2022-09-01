package lab;

public class Mascota {

	private String especie;
	private String nombre;
	private double peso;
	private String propietario;
	
	//para hacer los get y los set, voy a source==> Generate getters amd setters
	
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
//ahora genero constructor
	
	
	public Mascota(String especie, String nombre, double peso, String propietario) {
		super();
		this.especie = especie;
		this.nombre = nombre;
		this.peso = peso;
		this.propietario = propietario;
	}
	
	//ahora genero toString
	
	public Mascota () {
		
	}
	public Mascota(String especie2, String nombre2, int peso2, String propietario) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mascota [especie=" + especie + ", nombre=" + nombre + ", peso=" + peso + ", propietario=" + propietario
				+ "]";
	}
	
	//creo el metodo alimentar
	
	public String alimentar (double peso) { //recibe la variable peso y chequea si
		if (peso > 10) { //mayor a 10
			return "a dieta";
		} else if (peso < 2){ //sino si es menor a 2
			return "sumplementada";
		}  else { //si no es ninguna de las anteriores
			return "normal";
		}
	}
}


// con los atajos en source nos queda pronta la clase mascota en minutos
