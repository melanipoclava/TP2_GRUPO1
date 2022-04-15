package punto1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);//declaracion del objeto sc de scanner para ingresar numero
		System.out.print("Ingrese un numero entre el 0 y el 10 para calcular el factorial");
		double factorial = 1;
		//double numero = 5;
		double numero =sc.nextDouble();
				while (numero!=0){
					factorial=factorial*numero;
					numero--;
				}
		System.out.println(factorial);
		sc.close();
				}
	

}
