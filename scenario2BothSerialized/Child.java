package scenario2BothSerialized;

import java.io.Serializable;

public class Child extends Parent implements Serializable{
	
	
	
	
	public String cname;
	public int cage;
	
	
	public Child(String fname, int fage,String cname,int cage) {
		super(fname, fage);
		this.cname=cname;
		this.cage=cage;
		
	}


	@Override
	public String toString() {
		return "Child [cname=" + cname + ", cage=" + cage + ", fname=" + fname + ", fage=" + fage + "]";
	}
	
	
}
