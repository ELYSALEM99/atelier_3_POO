package atalier3;

public class Cylindre extends D3 {
	private int R;
	private int hauteur;
	public Cylindre(String nom,FormeGeom f,int R,int hauteur) {
		super(nom,f);
		this.R=R;
		this.hauteur=hauteur;
	}
	public double surface() {
		return (2*PI*R*hauteur);
	}
	public double volume() {
		return (PI*R*R*hauteur);
	}
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if(this==obj)
			result=true;
		else if(!(obj instanceof Cylindre))
			result=false;
		else 
		{
			Cylindre other=(Cylindre) obj;
			if(R==other.R && hauteur==other.hauteur)
				result=true;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return super.toString()+"D3 Cylindre [R=" + R + ", hauteur=" + hauteur + ", surface=" + surface() + ", volume=" + volume()+"]";
	}
}
