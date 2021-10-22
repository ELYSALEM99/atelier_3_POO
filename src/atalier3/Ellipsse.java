package atalier3;

public class Ellipsse extends D2 {
	private int G_r;
	private int P_r;
	
	public Ellipsse(String nom, FormeGeom f,int G_r,int P_r) {
		super(nom, f);
		this.G_r=G_r;
		this.P_r=P_r;
	}
	public double surface() {
		return (G_r*P_r*PI);
	}
	public double perimetre() {
		return (2*PI*(Math.sqrt((G_r*G_r +P_r*P_r)/2)));
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(this==obj)
			result=true;
		else if (!(obj instanceof Ellipsse))
			result=false;
		else
		{
			Ellipsse other = (Ellipsse) obj;
			if(G_r == other.G_r && P_r == other.P_r)
				result=true;
		}
		return result;
	}
	
	public String toString() {
		return super.toString()+"D2 Ellipsse [G_r=" + G_r + ", P_r=" + P_r +"," +"surface=" + surface()+ "," + "perimetre=" +perimetre()+"]";
	}
}
