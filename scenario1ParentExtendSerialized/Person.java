package scenario1ParentExtendSerialized;

import java.io.Serializable;

public class Person implements Serializable{
	
	
	public String name;
	 public int no;
	
//	public Person() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public Person(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", no=" + no + "]";
	}
	
	

}
