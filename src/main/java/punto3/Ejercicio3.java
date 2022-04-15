package punto3;

import java.util.Scanner;

public class Ejercicio3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Solicitar al usuario que ingrese 5 números enteros. Por cada número ingresado mostrar por consola si es
		un número par. Utilice alguna estructura de control repetitiva para ingresar los datos.
		Recordemos que para establecer si un número es par, el resto de la división de dicho número entre 2 tiene
		que dar cero.*/
		Scanner sc = new Scanner(System.in);
	    int contador = 0; 
		System.out.println("Ingrese 5 numeros enteros");
		while(contador <= 5){
			System.out.println("Ingrese un numero");
			int num1 = sc.nextInt();
			if ((num1 % 2)==0){
				System.out.println("El  numero ingresado es par ");
				contador++;
			}  
			else
				System.out.println("El numero ingresado es impar");
				contador++;
		}
		sc.close();

	}

}
