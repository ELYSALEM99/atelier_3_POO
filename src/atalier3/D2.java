package atalier3;

import java.util.Objects;

public  abstract class D2 extends FormeGeom  {
	protected static final double  PI=3.14;
	private FormeGeom forme;
	public D2(String nom,FormeGeom f) {
		super(nom);
		this.forme=f;
		nbFor++;
	}

	public abstract double surface();
	public abstract boolean equals(Object obj);

	@Override
	public int hashCode() {
		return Objects.hash(forme);
	}

	public String toString() {
		String resul1=nbFor + " de type ";
		return  forme + resul1;
	}
	
}
