package scenario3ChildSerialized;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		
		System.out.println("Only Child Implement serializable");
		System.out.println("----------------------------------");
		Child c=new Child(1,2,3,4);
		File file=new File("E:\\Scoopen\\abc.txt");
		
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		
		fos.close();
		oos.close();
		
		System.out.println("Serialization done");
		System.out.println(c);
		System.out.println("--------------------------------------------------------");
		
			
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Child c2=(Child) ois.readObject();
		fis.close();
		ois.close();
		
		System.out.println("Deserialization Done");
		System.out.println(c2);
		
	}

}
