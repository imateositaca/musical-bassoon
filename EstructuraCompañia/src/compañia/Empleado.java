package compañia;

public class Empleado {
	String nombre = "Empleado1";
	String posicion = "Jefe";
	String nombreDepartamento = "Recursos Humanos";
	
	public void decirHola() {
		System.out.println("Hola");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getNombreDepartamento() {
		return nombreDepartamento;
	}
	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", posicion=" + posicion + ", nombreDepartamento=" + nombreDepartamento
				+ "]";
	}

}
