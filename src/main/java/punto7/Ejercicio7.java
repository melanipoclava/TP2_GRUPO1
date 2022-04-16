package punto7;
public class Ejercicio7 {

	public static void main(String[] args) 
	{
	int j = 40;
	for(int i = 2; i <= 80; i=i+2) {
	if(i == 2) {
			j = (j+j);
			System.out.println(j);
			i++;
		}
				if(i <= 40) {
					j = (40 + j - i);
					System.out.println(j);
							}
				else {
					j =(j+ 40 - i);
					System.out.println(j);
					  }		
					
			}
	}

}



