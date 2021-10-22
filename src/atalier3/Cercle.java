package atalier3;

public class Cercle extends D2 {
	private int R;

	public Cercle(String nom, FormeGeom f,int r) {
		super(nom, f);
		this.R=r;
	}
	public double surface() {
		return (R*R*PI);
	}
	public double perimetre() {
		return (2*PI*R);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if(this==obj)
			result=true;
		else if(!(obj instanceof Cercle))
			result=false;
		else
		{
			Cercle other = (Cercle) obj;
			if(R == other.R)
				result=true;
		}
		return result;
		
	}
	@Override
	public String toString() {
		return super.toString()+"D2 Cercle [R=" + R +","+"surface=" +surface()+","+"perimetre=" +perimetre()+"]";
	}
}
