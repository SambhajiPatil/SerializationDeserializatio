package scenario3ChildSerialized;

import java.io.Serializable;

public class Child extends Parent implements Serializable{
	int c;
	int d;

	public Child(int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Child [c=" + c + ", d=" + d + ", a=" + a + ", b=" + b + "]";
	}
	
}
