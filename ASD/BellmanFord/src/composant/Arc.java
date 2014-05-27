package composant;

public class Arc {
	private int depart;
	private int arrivee;
	private double poids;
	
	public Arc(int depart, int arrivee, double poids){
		this.depart = depart;
		this.arrivee = arrivee;
		this.poids = poids;
	}
	
	/**
	 * @return the depart
	 */
	public int getDepart() {
		return depart;
	}
	/**
	 * @param depart the depart to set
	 */
	public void setDepart(int depart) {
		this.depart = depart;
	}
	/**
	 * @return the arrivee
	 */
	public int getArrivee() {
		return arrivee;
	}
	/**
	 * @param arrivee the arrivee to set
	 */
	public void setArrivee(int arrivee) {
		this.arrivee = arrivee;
	}

	/**
	 * @return the poids
	 */
	public double getPoids() {
		return poids;
	}

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(double poids) {
		this.poids = poids;
	}

}
