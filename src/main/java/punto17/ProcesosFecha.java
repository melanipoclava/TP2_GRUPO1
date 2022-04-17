package punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProcesosFecha {
	//definicion de los atributos de la clase proceso fecha
	LocalDate fecha1; 
	LocalDate fecha2;
	LocalTime time1;
	LocalTime time2;
	LocalDateTime dateTime1; 
	LocalDateTime dateTime2;
	
	//constructor por defecto
	public ProcesosFecha() {
		// TODO Auto-generated constructor stub
	}
	//constructores parametrizado
	/**
	 * @param fecha1
	 * @param fecha2
	 */
	public ProcesosFecha(LocalDate fecha1, LocalDate fecha2) {
		super();
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}
	
	/**
	 * @param time1
	 * @param time2
	 */
	public ProcesosFecha(LocalTime time1, LocalTime time2) {
		super();
		this.time1 = time1;
		this.time2 = time2;
	}
	
	
	/**
	 * @param dateTime1
	 * @param dateTime2
	 */
	public ProcesosFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		super();
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}
	/**
	 * @param fecha1
	 * @param fecha2
	 * @param time1
	 * @param time2
	 * @param dateTime1
	 * @param dateTime2
	 */
	public ProcesosFecha(LocalDate fecha1, LocalDate fecha2, LocalTime time1, LocalTime time2, LocalDateTime dateTime1,
			LocalDateTime dateTime2) {
		super();
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
		this.time1 = time1;
		this.time2 = time2;
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}



	//Metodos Accesores
	/**
	 * @return the fecha1
	 */
	public LocalDate getFecha1() {
		return fecha1;
	}

	/**
	 * @param fecha1 the fecha1 to set
	 */
	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}

	/**
	 * @return the fecha2
	 */
	public LocalDate getFecha2() {
		return fecha2;
	}

	/**
	 * @param fecha2 the fecha2 to set
	 */
	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}

	/**
	 * @return the time1
	 */
	public LocalTime getTime1() {
		return time1;
	}

	/**
	 * @param time1 the time1 to set
	 */
	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}

	/**
	 * @return the time2
	 */
	public LocalTime getTime2() {
		return time2;
	}

	/**
	 * @param time2 the time2 to set
	 */
	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}

	/**
	 * @return the dateTime1
	 */
	public LocalDateTime getDateTime1() {
		return dateTime1;
	}

	/**
	 * @param dateTime1 the dateTime1 to set
	 */
	public void setDateTime1(LocalDateTime dateTime1) {
		this.dateTime1 = dateTime1;
	}

	/**
	 * @return the dateTime2
	 */
	public LocalDateTime getDateTime2() {
		return dateTime2;
	}

	/**
	 * @param dateTime2 the dateTime2 to set
	 */
	public void setDateTime2(LocalDateTime dateTime2) {
		this.dateTime2 = dateTime2;
	}
	
	// metodos solicitados
	
	public Period contarTiempoTranscurrido() {
		Period periodo = Period.between(fecha1, fecha2);
		return periodo;
	}
	
	public String formatearFecha(LocalDate fecha) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String retorno=formato.format(fecha);
		return (retorno);
	}
	
	public String compararFechas() {
		String rta;
		//compara si fecha1 es despues que fecha2
		if (fecha1.isAfter(fecha2))
			rta= "b3) La fecha "+fecha1+" es porterior a la fecha "+fecha2;
		else
			//compara si fecha1 es antes que fecha2
			if (fecha1.isBefore(fecha2))
				rta= "b3) La fecha "+fecha1+" es anterior a la fecha "+fecha2;
			else
				rta= "b3) La fecha "+fecha1+" y la fecha"+fecha2+"son iguales";
			
		return (rta);
		
	}
	
	//
	public void decremento() {
		time1= time1.plusHours(5);
		time2=time2.minusMinutes(20);
		System.out.println("Incrementado: "+ time1 +" Decremetado: "+time2+"\n");
			}
	
	//procesp incrementa deias usa las variables trasncurso para tomar el valor que se desea incrementar
	//y typo para diferenciar la opcion dia mes y año
	public LocalDate incrementar(LocalDate fech,int transcurso, String typo) {
		LocalDate fechaincr=fech;
		if (typo=="M") {
			fechaincr= fech.plusMonths(transcurso);
		}else if(typo=="D") {
			fechaincr= fech.plusDays(transcurso);
		}else if (typo=="Y") {
			fechaincr= fech.plusYears(transcurso);
		}
		return fechaincr;
	}
}


