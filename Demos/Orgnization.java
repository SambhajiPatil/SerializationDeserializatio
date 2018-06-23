package Demos;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Orgnization implements Serializable{

	
	
	public Orgnization(int noofEmp, String location, Double companyloan) {
		super();
		NoofEmp = noofEmp;
		this.location = location;
		this.companyloan = companyloan;
	}

	public Orgnization() {
		super();
		System.out.println("Default Constructor");
		// TODO Auto-generated constructor stub
	}

	public int NoofEmp;
	public String location;
	transient public Double companyloan;
	
	
	
	@Override
	public String toString() {
		return "Orgnization NoofEmp in Orgnization :- " + NoofEmp + ",Orgnization Location :- " + location + ", Orgnization loan :- " + companyloan + "";
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		
		oos.defaultWriteObject();
		
		      //Encription
		//String ab=loan+"1234";  OR
		double ab=companyloan+782.4;
		oos.writeObject(ab);
		System.out.println("encription");
		System.out.println("Encripted :"+ab);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		       //decription
		
		//String ab=(String) ois.readObject();
		//ab=ab.substring(0, 5);
		
		double abc=(double) ois.readObject();
		abc=abc-782.4;
		System.out.println("Decription");
		System.out.println("Decripted :"+abc);
		
	}
	
	
	
}
