package scenario2BothSerialized;

import java.io.Serializable;

public class Parent implements Serializable {

	
	
	public Parent(String fname, int fage) {
		super();
		this.fname = fname;
		this.fage = fage;
	}
	public String fname;
	public int fage;
    

}
