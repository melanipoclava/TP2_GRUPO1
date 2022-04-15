package punto2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el año para seber si es bisiesto o no ,por ejemplo 2022");
		int anio = sc.nextInt();
		if((anio%4==0)&&(anio%100!=0)){
			System.out.println("El año es bisiesto ");
			}else if(anio%400==0){
				System.out.println("El año es bisiesto ");
			}else {
				System.out.println("El año NO es bisiesto ");
			}
				sc.close();
		
				
	}

}
