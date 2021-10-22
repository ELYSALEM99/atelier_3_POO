package atalier3;

public class Rectangle extends D2 {
	private int lon;
	private int lar;

	public Rectangle(String nom, FormeGeom f,int lon,int lar) {
		super(nom, f);
		this.lon=lon;
		this.lar=lar;
	}
	public double surface() {
		return (lon*lar);
	}
	public double perimetre() {
		return (2*(lon+lar));
	}
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if (this == obj)
			result=true;
		else if (!(obj instanceof Rectangle))
			result=false;
		else
		{
			Rectangle other = (Rectangle) obj;
			if(lar == other.lar && lon == other.lon)
				result=true;
		}
		return result;
	}
	@Override
	public String toString() {
		return super.toString()+"D2 Rectangle[lon=" + lon + ", lar=" + lar + ", surface=" + surface() + ", perimetre=" + perimetre()
				+ "]";
	}
	
}
