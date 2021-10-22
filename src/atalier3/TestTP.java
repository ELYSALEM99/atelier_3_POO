package atalier3;

public class TestTP {

	public static void main(String[] args) {
		FormeGeom f1=new FormeGeom("FormeGeom");
		D2 e1=new Ellipsse("Ellipsse",f1,2,1);
		System.out.println(e1);
		D2 c1=new Cercle("Cercle",f1,2);
		System.out.println(c1);
		D2 r1=new Rectangle("Rectangle",f1,4,2);
		System.out.println(r1);
		D3 cy1=new Cylindre("Cylindre",f1,2,8);
		System.out.println(cy1);
		D3 s1=new Sphere("Sphere",f1,3);
		System.out.println(s1);
		D2 c2=new Cercle("cercle2",f1,2);
		System.out.println(c1.equals(c2));	
	}
}
