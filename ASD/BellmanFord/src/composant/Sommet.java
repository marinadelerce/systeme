package composant;

public class Sommet {
	private int numero;
	private double cout;
	
	public Sommet(int numero, double cout){
		this.numero = numero;
		this.cout = cout;
	}
	
	public Sommet(int numero){
		this(numero, 2147483647);
	}
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the cout
	 */
	public double getCout() {
		return cout;
	}

	/**
	 * @param cout the cout to set
	 */
	public void setCout(double cout) {
		this.cout = cout;
	}
	
}
