package composant;

public class BellmanFord {
	private Graphe graphe;
	private int depart;

	public BellmanFord(Graphe graphe, int depart) {
		this.graphe = graphe;
		this.depart = depart;
	}

	public boolean contientCycleNegatif() {
		/**
		 * Initialisation
		 */
		graphe.getSommets().get(depart).setCout(0);
		for (int i = 0; i < graphe.getSommets().size(); i++) {
			if (i != depart) {
				graphe.getSommets().get(i).setCout(2147483647);
			}
		}

		/**
		 * Relaxation
		 */
		int sommetDepart, sommetArrivee, cpt = 0;
		double coutTemp, coutArrivee;
		boolean repeter = true;
		for (int i = 0; i < graphe.getSommets().size() - 1; i++) {
			if (repeter) {
				cpt++;
				repeter = false;
				for (int j = 0; j < graphe.getArcs().size(); j++) {
					sommetDepart = graphe.getArcs().get(j).getDepart();
					sommetArrivee = graphe.getArcs().get(j).getArrivee();
					coutArrivee = graphe.getSommets().get(sommetArrivee)
							.getCout();
					coutTemp = graphe.getSommets().get(sommetDepart).getCout()
							+ graphe.getArcs().get(j).getPoids();
					if (coutArrivee > coutTemp) {
						repeter = true;
						graphe.getSommets().get(sommetArrivee)
								.setCout(coutTemp);
					}
				}
			}
		}
		
		System.out.println(cpt);

		/**
		 * Verification
		 */
		for (int j = 0; j < graphe.getArcs().size(); j++) {
			sommetDepart = graphe.getArcs().get(j).getDepart();
			sommetArrivee = graphe.getArcs().get(j).getArrivee();
			coutArrivee = graphe.getSommets().get(sommetArrivee).getCout();
			coutTemp = graphe.getSommets().get(sommetDepart).getCout()
					+ graphe.getArcs().get(j).getPoids();
			if (coutArrivee > coutTemp) {
				return true;
			}
		}
		return false;
	}

	public String valeurDesSommets(char firstLettre) {
		String str = "";
		for (int i = 0; i < graphe.getSommets().size(); i++) {
			if (graphe.getSommets().get(i).getCout() == 2147483647) {
				str += "Sommet " + (char) (firstLettre + i)
						+ " coute infini. \n";
			} else {
				str += "Sommet " + (char) (firstLettre + i) + " coute "
						+ graphe.getSommets().get(i).getCout() + ".\n";
			}
		}
		return str;
	}

	public String valeurDesSommets() {
		String str = "";
		for (int i = 0; i < graphe.getSommets().size(); i++) {
			if (graphe.getSommets().get(i).getCout() == 2147483647) {
				str += "Sommet " + i + " coute infini. \n";
			} else {
				str += "Sommet " + i + " coute "
						+ graphe.getSommets().get(i).getCout() + ".\n";
			}
		}
		return str;
	}

	/**
	 * @return the graphe
	 */
	public Graphe getGraphe() {
		return graphe;
	}

	/**
	 * @param graphe
	 *            the graphe to set
	 */
	public void setGraphe(Graphe graphe) {
		this.graphe = graphe;
	}

	/**
	 * @return the depart
	 */
	public int getDepart() {
		return depart;
	}

	/**
	 * @param depart
	 *            the depart to set
	 */
	public void setDepart(int depart) {
		this.depart = depart;
	}
}
