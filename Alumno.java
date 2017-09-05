package Librerias;

public class Alumno implements Comparable<Alumno> {
	private String nombre;
	private int cu;
	private static int cont=1212;
	private int edad;
	
	public Alumno(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		cu=cont;
		cont++;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCu() {
		return cu;
	}
	
	public int compareTo(Alumno a){
		return cu-a.cu;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cu;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (cu != other.cu)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", cu=" + cu + ", edad=" + edad + "]";
	}
	
	
	
	
	

}
