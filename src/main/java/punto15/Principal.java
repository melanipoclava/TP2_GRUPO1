package punto15;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//punto 15 ejemplificacion del objeto persona
				LocalDate cumfech=LocalDate.of(1998, 11, 18);
				Persona persona = new Persona("gabriel",cumfech);
				System.out.println(persona.devolverInf());
	}

}
