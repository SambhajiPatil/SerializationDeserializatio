package scenario1ParentExtendSerialized;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		//Person p=new Person("abcd",120);
		
		System.out.println("Only Parent Implement serializable");
		System.out.println("----------------------------------");
		Employee e1=new Employee("pp",01, "emp1", 11);
		
		
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		fos.close();
		oos.close();
		System.out.println("Serialization Completed");
		System.out.println("------------------------------------------");
		
		
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Employee e2=(Employee) ois.readObject();
		fis.close();
		ois.close();
		System.out.println("Deserialization Completed");
		
		
		System.out.println(e1);
		
		
		
		
		
	}

}
