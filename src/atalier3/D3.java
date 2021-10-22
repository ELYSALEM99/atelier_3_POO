package atalier3;

public abstract class D3 extends FormeGeom {
	static final double  PI=3.14;
	private FormeGeom formeGeo;
	
	public D3(String nom,FormeGeom f) {
		super(nom);
		formeGeo=f;
		nbFor++;
	}

	public abstract double volume();
	
	public abstract double surface();
	
	public abstract  boolean equals(Object obj);
	public String toString() {
		String result2=nbFor + " de type ";
		return formeGeo + result2;
	}

}
