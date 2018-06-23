package scenario1ParentExtendSerialized;

public class Employee extends Person {

	public String ename;
	public int mobno;
	
	public Employee(String name, int no, String ename, int mobno) {
		super(name, no);
		this.ename = ename;
		this.mobno = mobno;
	}
	
	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", mobno=" + mobno + ", name=" + name + ", no=" + no + "]";
	}
	
	
	
	
	
	
}
