package test;

import java.util.ArrayList;
import java.util.List;

import composant.Arc;
import composant.BellmanFord;
import composant.Graphe;
import composant.Sommet;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Graphe graphe = new Graphe();
		BellmanFord bellmanFord = new BellmanFord(graphe, 0);
		List<Sommet> sommets = new ArrayList<>();
		List<Arc> arcs = new ArrayList<>();
		
		/**
		 * -----------------------------------------------------------------------------------------------
		 * 						TEST I SUR DES GRAPHES RANDOM
		 * -----------------------------------------------------------------------------------------------
		 */
		
		
		/**
		 * ne contient pas de cycle negatif
		 */
		sommets.add(new Sommet(0));
		sommets.add(new Sommet(1));
		sommets.add(new Sommet(2));
		
		arcs.add(new Arc(0, 1, 3));
		arcs.add(new Arc(1, 2, 4));
		arcs.add(new Arc(2, 0, -3));
		
		graphe.setSommets(sommets);
		graphe.setArcs(arcs);
		
		System.out.println(bellmanFord.contientCycleNegatif());
		System.out.println(bellmanFord.valeurDesSommets());
		System.out.println("---------------------------------------------------------");
		
		/**
		 * contient un cycle negatif
		 */
		sommets = new ArrayList<>();
		sommets.add(new Sommet(0));
		sommets.add(new Sommet(1));
		sommets.add(new Sommet(2));
		
		arcs = new ArrayList<>();
		arcs.add(new Arc(0, 1, 3));
		arcs.add(new Arc(1, 2, -4));
		arcs.add(new Arc(2, 0, -3));
		
		graphe.setSommets(sommets);
		graphe.setArcs(arcs);
		
		System.out.println(bellmanFord.contientCycleNegatif());
		System.out.println(bellmanFord.valeurDesSommets());
		System.out.println("---------------------------------------------------------");
	
		/**
		 * contient un cycle negatif
		 */
		sommets = new ArrayList<>();
		sommets.add(new Sommet(0));
		sommets.add(new Sommet(1));
		sommets.add(new Sommet(2));
		sommets.add(new Sommet(3));
		sommets.add(new Sommet(4));
		sommets.add(new Sommet(5));
		
		arcs = new ArrayList<>();
		arcs.add(new Arc(0, 1, 8));
		arcs.add(new Arc(1, 0, 8));
		arcs.add(new Arc(0, 2, 3));
		arcs.add(new Arc(2, 0, 3));
		arcs.add(new Arc(1, 3, 2));
		arcs.add(new Arc(3, 1, 2));
		arcs.add(new Arc(2, 3, 8));
		arcs.add(new Arc(2, 5, 6));
		arcs.add(new Arc(3, 4, 4));
		arcs.add(new Arc(5, 4, 4));
		
		graphe.setSommets(sommets);
		graphe.setArcs(arcs);
		
		System.out.println(bellmanFord.contientCycleNegatif());
		System.out.println(bellmanFord.valeurDesSommets());
		System.out.println("---------------------------------------------------------");
		
		/**
		 * -----------------------------------------------------------------------------------------------
		 * 						TEST II SUR LES GRAPHES DU RAPPORT
		 * -----------------------------------------------------------------------------------------------
		 */
		
		/**
		 * Graphe contenant uniquement des arcs de poids positifs.
		 */
		sommets = new ArrayList<>();
		sommets.add(new Sommet(0));
		sommets.add(new Sommet(1));
		sommets.add(new Sommet(2));
		sommets.add(new Sommet(3));
		sommets.add(new Sommet(4));
		sommets.add(new Sommet(5));
		sommets.add(new Sommet(6));
		
		arcs = new ArrayList<>();
		arcs.add(new Arc(0, 1, 15));
		arcs.add(new Arc(0, 2, 20));
		arcs.add(new Arc(1, 3, 10));
		arcs.add(new Arc(2, 3, 15));
		arcs.add(new Arc(1, 4, 25));
		arcs.add(new Arc(2, 3, 15));
		arcs.add(new Arc(4, 6, 10));
		arcs.add(new Arc(2, 5, 20));
		arcs.add(new Arc(3, 4, 20));   
		arcs.add(new Arc(3, 6, 30));
		arcs.add(new Arc(3, 5, 15));
		
		graphe.setSommets(sommets);
		graphe.setArcs(arcs);
		
		System.out.println("Graphe contenant uniquement des arcs de poids positifs.");
		System.out.println("Bellman-Ford : " + bellmanFord.contientCycleNegatif());
		System.out.println("Valeur des sommets du graphe :");
		System.out.println(bellmanFord.valeurDesSommets('a'));
		System.out.println("---------------------------------------------------------");
		
		/**
		 * Graphe contenant des arcs de poids réels.
		 */
		sommets = new ArrayList<>();
		sommets.add(new Sommet(0));
		sommets.add(new Sommet(1));
		sommets.add(new Sommet(2));
		sommets.add(new Sommet(3));
		sommets.add(new Sommet(4));
		sommets.add(new Sommet(5));
		
		arcs = new ArrayList<>();
		arcs.add(new Arc(0, 1, 3));
		arcs.add(new Arc(0, 2, 8));
		arcs.add(new Arc(1, 2, 3));
		arcs.add(new Arc(1, 3, -6));
		arcs.add(new Arc(3, 4, 4));
		arcs.add(new Arc(4, 5, -4));
		arcs.add(new Arc(1, 5, 3));
		arcs.add(new Arc(2, 5, 2));
		
		graphe.setSommets(sommets);
		graphe.setArcs(arcs);
		
		System.out.println("Graphe contenant des arcs de poids reels.");
		System.out.println("Bellman-Ford : " + bellmanFord.contientCycleNegatif());
		System.out.println("Valeur des sommets du graphe :");
		System.out.println(bellmanFord.valeurDesSommets('a'));
		System.out.println("---------------------------------------------------------");
		
		/**
		 * Graphe contenant des arcs de poids reels et un cycle non negatif.
		 */
		sommets = new ArrayList<>();
		sommets.add(new Sommet(0));
		sommets.add(new Sommet(1));
		sommets.add(new Sommet(2));
		sommets.add(new Sommet(3));
		sommets.add(new Sommet(4));
		sommets.add(new Sommet(5));
		
		arcs = new ArrayList<>();
		arcs.add(new Arc(0, 1, -3));
		arcs.add(new Arc(0, 2, 8));
		arcs.add(new Arc(1, 2, 3));
		arcs.add(new Arc(1, 3, 6));
		arcs.add(new Arc(3, 4, -4));
		arcs.add(new Arc(4, 5, 4));
		arcs.add(new Arc(1, 5, 8));
		arcs.add(new Arc(2, 5, -2));
		
		graphe.setSommets(sommets);
		graphe.setArcs(arcs);
		
		System.out.println("Graphe contenant des arcs de poids reels et un cycle non negatif.");
		System.out.println("Bellman-Ford : " + bellmanFord.contientCycleNegatif());
		System.out.println("Valeur des sommets du graphe :");
		System.out.println(bellmanFord.valeurDesSommets('a'));
		System.out.println("---------------------------------------------------------");
		
		/**
		 * Graphe contenant des arcs de poids reels et un cycle negatif.
		 */
		sommets = new ArrayList<>();
		sommets.add(new Sommet(0));
		sommets.add(new Sommet(1));
		sommets.add(new Sommet(2));
		sommets.add(new Sommet(3));
		sommets.add(new Sommet(4));
		sommets.add(new Sommet(5));
		
		arcs = new ArrayList<>();
		arcs.add(new Arc(0, 1, 3));
		arcs.add(new Arc(1, 3, -6));
		arcs.add(new Arc(3, 4, 4));
		arcs.add(new Arc(4, 5, -4));
		arcs.add(new Arc(5, 2, 2));
		arcs.add(new Arc(2, 1, 3));
		arcs.add(new Arc(1, 5, 8));
		arcs.add(new Arc(0, 2, 8));
		
		graphe.setSommets(sommets);
		graphe.setArcs(arcs);
		
		System.out.println("Graphe contenant des arcs de poids reels et un cycle negatif.");
		System.out.println("Bellman-Ford : " + bellmanFord.contientCycleNegatif());
		System.out.println("Valeur des sommets du graphe :");
		System.out.println(bellmanFord.valeurDesSommets('a'));
		System.out.println("---------------------------------------------------------");
	}

}
