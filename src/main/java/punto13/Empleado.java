package punto13;

import java.time.LocalDate;

public class Empleado {

	String Nombre;
	LocalDate fechaIngreso = LocalDate.of(1900,01,01);
	int legajo=-9999;
	String email;
	int sueldo;
	int horasTrabajadas;
	
	public int calcularSueldo() {
		if(horasTrabajadas<=160) {
			sueldo=horasTrabajadas*600;
		}else if(horasTrabajadas>160){
			sueldo=horasTrabajadas*650;
		}
		return (sueldo);
	}
	
	//constructor solo nombre y horas trabajadas
	
	/**
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public Empleado(String nombre, int horasTrabajadas) {
		super();
		Nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
	}
	//constructor parametrizado con atributos nombre le y hs trabajadas
	/**
	 * @param nombre
	 * @param legajo
	 * @param horasTrabajadas
	 */
	public Empleado(String nombre, int legajo, int horasTrabajadas) {
		super();
		Nombre = nombre;
		this.legajo = legajo;
		this.horasTrabajadas = horasTrabajadas;
	}
	

	//constructor parametrizado con atributos nombre ingreso y hs trabajadas
	/**
	 * @param nombre
	 * @param fechaIngreso
	 * @param horasTrabajadas
	 */
	public Empleado(String nombre, LocalDate fechaIngreso, int horasTrabajadas) {
		super();
		Nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.horasTrabajadas = horasTrabajadas;
	}


	
	//constructr por defecto
	public Empleado(){
		
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	/**
	 * @return the fechaIngreso
	 */
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}



	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}



	/**
	 * @return the legajo
	 */
	public int getLegajo() {
		return legajo;
	}



	/**
	 * @param legajo the legajo to set
	 */
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @return the sueldo
	 */
	public int getSueldo() {
		return calcularSueldo();
	}



	/**
	 * @return the horasTrabajadas
	 */
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}



	/**
	 * @param horasTrabajadas the horasTrabajadas to set
	 */
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}




	/**
	 * @param nombre
	 * @param fechaIngreso
	 * @param legajo
	 * @param email
	 * @param horasTrabajadas
	 */
	public Empleado(String nombre, LocalDate fechaIngreso, int legajo, String email, int horasTrabajadas) {
		super();
		Nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.legajo = legajo;
		this.email = email;
		this.horasTrabajadas = horasTrabajadas;
	}





	
	
	
}
