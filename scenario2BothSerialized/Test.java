package scenario2BothSerialized;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		
		System.out.println("Both  Implement serializable");
		System.out.println("----------------------------------");
		Child c=new Child("father", 55, "child", 26);
		
		File file=new File("E:\\Scoopen\\abc.txt");
		
		
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		fos.close();
		oos.close();
	    System.out.println("serializatin is done ");
	    System.out.println(c);
	   System.out.println("----------------------------------------");
	    
	    
		
	    FileInputStream fis=new FileInputStream(file);
	    ObjectInputStream ois=new ObjectInputStream(fis);
	    Child cc= (Child) ois.readObject();
	    fis.close();
	    ois.close();
	    System.out.println("Deserializatin is done ");
	    
	    System.out.println(cc);
	   
	    
	
	
	
		
	}

}
