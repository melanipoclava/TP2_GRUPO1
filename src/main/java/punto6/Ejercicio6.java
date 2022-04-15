package punto6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Boolean band = true;
		while(band == true){
			System.out.println("ingrese un numero");
			int num = sc.nextInt();
			if(num==6) {
				System.out.println("Alumno regulariza");
			}else if((num>=7)&&(num<=10)){
					System.out.println("El alumno Promociona");
				}else if((num<6)&&(num>=1)) {
						System.out.println("El alumno desaprueba");
					}else {
						System.out.println("Valor no permitido");
						band = false;
					}
		}
		
		sc.close();

	}

}
