package punto16;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//punto 16 ejemplificacion del objeto calculo matematico
		CalculoMatematico unCalculo= new CalculoMatematico();
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un numero: ");
		int valor=scan.nextInt();
		unCalculo.setN(valor);
		System.out.println(unCalculo.calcularSumatoria());
		System.out.println(unCalculo.calcularProductoria());
		scan.close();
	}

}
