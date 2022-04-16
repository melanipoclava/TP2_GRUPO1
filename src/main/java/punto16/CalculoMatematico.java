package punto16;

public class CalculoMatematico {
	private int n;

	
	public double calcularSumatoria() {
		double ac=0;
		for (int k=1;k<=n;k++ ) {
			ac=ac+Math.pow(((k*(k+1))/2), 2);
		}
		return ac;
	}
	
	public double calcularProductoria() {
		double ac=1;
		for (int k=1;k<=n;k++ ) {
			ac=ac*(k*(k+4));
		}
		return ac;
	}
	
	/**
	 * @param n
	 */
	public CalculoMatematico(int n) {
		super();
		this.n = n;
	}
	
	public CalculoMatematico() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the n
	 */
	public int getN() {
		return n;
	}

	/**
	 * @param n the n to set
	 */
	public void setN(int n) {
		this.n = n;
	}
	
	
}
