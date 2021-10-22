package atalier3;

public class Sphere extends D3 {
	private int R;

	public Sphere(String nom,FormeGeom f,int R) {
		super(nom,f);
		this.R=R;
	}
	public double surface() {
		return (4*PI*R*R);
	}
	public double volume() {
		return ((4*PI*R*R*R)/3);
	}
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if(this==obj)
			result=true;
		else if(!(obj instanceof Sphere ))
			result=false;
		else 
		{
			Sphere other=(Sphere) obj;
			if(R==other.R)
				result=true;
		}
		return result;
	}
	@Override
	public String toString() {
		return super.toString()+"D3 Sphere [R=" + R + ", surface=" + surface() + ", volume=" + volume()+"]";
	}
}
