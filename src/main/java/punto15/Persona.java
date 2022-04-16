package punto15;

import java.time.LocalDate;
import java.time.Period;
public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	
	
	public String  devolverInf() {
		String cad=("tiene: "+calcularEdad()+"\n estacion: "+devolverEstacion()+"\n Zigno Zodiacal: "+devolverSignoZodiacal());
		return cad;
	} 	
	
	public String devolverEstacion() {
		String est="";
		int dia = fechaNacimiento.getDayOfMonth();
		int mes = fechaNacimiento.getMonthValue();
		
		if(mes >=1 && mes <4) {
			if(mes==3 && dia>20) {
				est="otoño";
			}else {
				est="verano";
			}
		}else if(mes>3 && mes <7) {
			if(mes==6 && dia>20) {
				est="invierno";
			}else {
				est="otoño";
			}
		}else if(mes>6 && mes <10) {
			if(mes==9 && dia>20) {
				est="primavera";
			}else {
				est="invierno";
			}
		}else  if(mes>9 && mes <12) {
			if(mes==12 && dia>20) {
				est="verano";
			}else {
				est="primavera";
			}
		}
		return est;
	}
	
	public int calcularEdad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, hoy);
		int edad=periodo.getYears();
		return edad;
	}
	
	public String devolverSignoZodiacal() {
		String zod="";
		int dia = fechaNacimiento.getDayOfMonth();
		int mes = fechaNacimiento.getMonthValue();
		switch(mes) {
		case 1:
			if(dia>=20 && dia<=31) {
				zod="acuario";
			}else if(dia<20) {
				zod="capricornio";
			}
			break;
		case 2:
			if(dia>=20 && dia<=28) {
				zod="pisis";
			}else if(dia<20) {
				zod="acuario";
			}
			break;
		case 3:
			if(dia>=21 && dia<=31) {
				zod="aries";
			}else if(dia<21) {
				zod="picis";
			}
			break;
		case 4:
			if(dia>=21 && dia<=30) {
				zod="tauro";
			}else if(dia<21) {
				zod="aries";
				}
			break;
		case 5:
			if(dia>=22 && dia<=31) {
				zod="geminis";
			}else if(dia<22) {
				zod="tauro";
				}
			break;
		case 6:
			if(dia>=22 && dia<=30) {
				zod="cancer";
			}else if(dia<22) {
				zod="geminis";
			}
			break;
		case 7:
			if(dia>=24 && dia<=31) {
				zod="leo";
			}else if(dia<24) {
				zod="cancer";
				}
			break;
		case 8:
			if(dia>=24 && dia<=31) {
			zod="virgo";
		}else if(dia<24) {
			zod="leo";
			}
		break;
		case 9:
			if(dia>=23 && dia<=30) {
				zod="libra";
			}else if(dia<23) {
				zod="virgo";
				}
			break;
		case 10:
			if(dia>=23 && dia<=31) {
				zod="escorpio";
			}else if(dia<23) {
				zod="libra";
				}
			break;
		case 11:
			if(dia>=23 && dia<=30) {
				zod="sagitario";
			}else if(dia<23) {
				zod="escorpio";
				}
			break;
		case 12:
			if(dia>=22 && dia<=31) {
				zod="capricornio";
			}else if(dia<22) {
				zod="sagitario";
				}
			break;
			default:
			break;
		}
		return zod;
	}


	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	/**
	 * @param nombre
	 * @param fechaNacimiento
	 */
	public Persona(String nombre, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	} 
	
	
}
