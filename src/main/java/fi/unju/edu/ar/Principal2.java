package fi.unju.edu.ar;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal2 {
	public static void main(String[]args) {	
		Scanner sc = new Scanner(System.in);
	GregorianCalendar calendar = new GregorianCalendar() ;//importe de java.util.GregorianCalendar,
	System.out.println("Ingrese el año para seber si es bisiesto o no ,por ejemplo 2022");
	int anio = sc.nextInt();
	if (calendar.isLeapYear(anio)) {
		System.out.println("El año es bisiesto");}
	else {
		System.out.println("El año no es bisiesto");}
	sc.close();
	}
	
	
}