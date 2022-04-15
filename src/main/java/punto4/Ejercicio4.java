package punto4;
//import java.util.Calendar;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*4.- Solicite al usuario de forma repetitiva que ingrese un número de tipo entero y verifique si
corresponde a algún mes del año. Si el número no corresponde a ningún mes, muestre un
mensaje “no existe ese mes” y finaliza el ingreso de datos. Utilice la estructura de control de
selección use la estructura de control if.*/
	
	//	Calendar num =Calendar.getInstance();
      //  int mes = num.get(Calendar.MONTH);
	
		boolean band =true;
		Scanner sc = new Scanner(System.in);
		
			while (band == true) {
				
				System.out.println("ingrese un número de tipo entero del 1 al 12");
				System.out.println("ingrese cualquier otro valor para salir del sistema");
				int num = sc.nextInt();
				
				if ((num>=1)&&(num<=12)) {
					//System.out.println( (Calendar.MONTH));
					if(num==1) {
						System.out.println("Este numero del mes corresponde a Enero");
					}
					if(num==2) {
						System.out.println("Este numero del mes corresponde a Febrero");
					}
					if(num==3) {
						System.out.println("Este numero del mes corresponde a Marzo");
					}
					if(num==4) {
						System.out.println("Este numero del mes corresponde a Abril");
					}
					if(num==5) {
						System.out.println("Este numero del mes corresponde a Mayo");
					}
					if(num==6) {
						System.out.println("Este numero del mes corresponde a Junio");
					}
					if(num==7) {
						System.out.println("Este numero del mes corresponde a Julio");
					}
					if(num==8) {
						System.out.println("Este numero del mes corresponde a Agosto");
					}
					if(num==9) {
						System.out.println("Este numero del mes corresponde a Septiembre");
					}
					if(num==10) {
						System.out.println("Este numero del mes corresponde a Octubre");
					}
					if(num==11) {
						System.out.println("Este numero del mes corresponde a Noviembre");
					}
					if(num==12) {
						System.out.println("Este numero del mes corresponde a Diciembre");
					}
					
				}else {
						System.out.println("no existe ese mes");
						band = false;
					  }
			}
			sc.close();
	}

	
}
