package atalier3;

public  class FormeGeom {
	private String nom;
	public static int nbFor=0;

	public FormeGeom(String nom) {
		this.nom=nom+" _";
	}
	
	public String toString() {
		return nom;
	}
}
