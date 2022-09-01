package uy.edu.utec.clases;

public class Mascota {
	private String nombre;
	private String especie;
	private int peso;
	private Persona propietario;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	public Mascota(String nombre, String especie, int peso, Persona propietario) {
		this.nombre = nombre;
		this.especie = especie;
		this.peso = peso;
		this.propietario = propietario;
	}
	public Mascota() {
	}
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", especie=" + especie + ", peso=" + peso + ", propietario=" + propietario
				+ "]";
	}
	
	public String alimentacion() {
		if(peso>10) {
			return "a dieta";
		} else if( peso < 2) {
			return "suplementada";
		} else {
			return "normal";
		}
	}
}
