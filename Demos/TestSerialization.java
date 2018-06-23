package Demos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
       Orgnization org= new Orgnization(125,"Mumbai",15623.0);
       
       File file=new File("E:\\Scoopen\\xyz.txt");
       
       FileOutputStream fos=new FileOutputStream(file);
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       oos.writeObject(org);
       fos.close();
       oos.close();
       System.out.println("Serialization Completed");
    
       System.out.println("-------------------------------------------");
       FileInputStream fis=new FileInputStream(file);
       ObjectInputStream ois=new ObjectInputStream(fis);
       Orgnization org1=(Orgnization) ois.readObject();
       fis.close();
       ois.close();
       System.out.println("Deserialization Completed");
       System.out.println("---------------------------------------------");
       
		System.out.println(org==org1);
		System.out.println("Serialize : "+org);
		System.out.println("Deserialize :"+org1);
		
	}

}
