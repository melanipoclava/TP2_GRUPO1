package punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;



public class principal {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ProcesosFecha pf1 = new ProcesosFecha(LocalDate.of(2022,01,21),LocalDate.of(2021,11,21));
		System.out.println("b1) "+pf1.getFecha1()+" y "+pf1.getFecha2()+"\n");
		//b2 
		
		ProcesosFecha pf2 = new ProcesosFecha(LocalTime.parse("10:11:31"),LocalTime.parse("20:12:01"));
		System.out.println("b2) Tiempo registrado: "+pf2.getTime1() +" tiempo registrado: "+pf2.getTime2());
		pf2.decremento();
		
		//b3
		
		System.out.println(pf1.compararFechas()+"\n");
		
		//b4
		
		ProcesosFecha pf3= new ProcesosFecha(LocalDateTime.of(pf1.fecha1, pf2.time1),LocalDateTime.of(pf1.fecha2, pf2.time2));
		System.out.println("b4) "+pf3.dateTime1+" y " +pf3.dateTime2+"\n");
		
		//b5
		
		ProcesosFecha pf4= new ProcesosFecha(LocalDate.of(1998, 11, 11),LocalDate.now());
		System.out.println("b5) Han Transcurrido "+pf4.contarTiempoTranscurrido().getYears()+" años, "+pf4.contarTiempoTranscurrido().getMonths()+" meses, "+pf4.contarTiempoTranscurrido().getDays()+" dias"+"\n");
	   //b6 y b7
		do {
		try {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ingrese fecha en este  formato dd/MM/yyyy");
		String fcha = scan.nextLine();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dfech = LocalDate.parse(fcha, formateador);
		ProcesosFecha pf5 = new ProcesosFecha();
		pf5.setFecha1(dfech);
		LocalDate dfech2 = pf5.incrementar(pf5.getFecha1(),365,"D");
		System.out.println(pf5.getFecha1()+" ==>"+dfech2);
		 
		System.out.println("b6 & b7) Ingrese fecha en este  formato dd/MM/yyyy");
		String fcha1 = scan.nextLine();
		LocalDate ffech = LocalDate.parse(fcha1, formateador);
		pf5.setFecha2(ffech);
		LocalDate ffech2 = pf5.incrementar(pf5.getFecha2(),6,"M");
		System.out.println(pf5.getFecha2()+" ==>"+ffech2);
		break;
		}catch (DateTimeParseException e)
		{
			System.out.println(e);
		}
		}while (true);	
	}
	

}
