package punto5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		boolean band =true;
		while (band == true) {
			System.out.println("ingrese un número de tipo entero del 1 al 12");
			System.out.println("ingrese cualquier otro valor para salir del sistema");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("Este numero del mes corresponde a Enero");
				break;
			case 2:
				System.out.println("Este numero del mes corresponde a Febrero");
				break;
			case 3:
				System.out.println("Este numero del mes corresponde a Marzo");
				break;
			case 4:
				System.out.println("Este numero del mes corresponde a Abril");
				break;
			case 5:
				System.out.println("Este numero del mes corresponde a Mayo");
				break;
			case 6:
				System.out.println("Este numero del mes corresponde a Junio");
				break;
			case 7:
				System.out.println("Este numero del mes corresponde a Julio");
				break;
			case 8:
				System.out.println("Este numero del mes corresponde a Agosto");
				break;
			case 9:
				System.out.println("Este numero del mes corresponde a Septiembre");
				break;
			case 10:
				System.out.println("Este numero del mes corresponde a Octubre");
				break;
			case 11:
				System.out.println("Este numero del mes corresponde a Noviembre");
				break;
			case 12:
				System.out.println("Este numero del mes corresponde a Diciembre");
				break;
			default:
				System.out.println("no existe ese mes");
				band = false;
				break;
					
			}
		}
				
		
				
				sc.close();
	}

}
