package composant;

import java.util.ArrayList;
import java.util.List;

public class Graphe {
	private List<Arc> arcs;
	private List<Sommet> sommets;

	public Graphe() {
		this.arcs = new ArrayList<>();
		this.sommets = new ArrayList<>();
	}

	public Graphe(int nbSommets) {
		this();
		for (int i = 0; i < nbSommets; i++) {
			this.sommets.add(new Sommet(i + 1));
		}
	}

	public void connecter(int sommetA, int sommetB, double poids) {
		arcs.add(new Arc(sommetA, sommetB, poids));
	}

	/**
	 * @return the arcs
	 */
	public List<Arc> getArcs() {
		return arcs;
	}

	/**
	 * @param arcs
	 *            the arcs to set
	 */
	public void setArcs(List<Arc> arcs) {
		this.arcs = arcs;
	}

	/**
	 * @return the sommets
	 */
	public List<Sommet> getSommets() {
		return sommets;
	}

	/**
	 * @param sommets
	 *            the sommets to set
	 */
	public void setSommets(List<Sommet> sommets) {
		this.sommets = sommets;
	}
}
