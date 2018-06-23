package CustomeSerialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestCustomSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		school sc=new school("abcd", 1233.6);
		
		//File file=new File(pathname);
		
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(sc);
		System.out.println("serialization done here:"+oos);
		fos.close();
		oos.close();
		
		System.out.println("-------------------------------------------");
		
		
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		school sc2=(school)ois.readObject();
		System.out.println("and serialization done here :"+sc2);
		fis.close();
		ois.close();
	
		
		
		
		
	}

}

class school implements Serializable{
		
	public String name;
	transient public double fond;
	
	public school() {
		super();
		// TODO Auto-generated constructor stub
	}
	public school(String name, double fond) {
		super();
		this.name = name;
		this.fond = fond;
	}
	
	@Override
	public String toString() {
		return "school [name=" + name + ", fond=" + fond + "]";
	}
	
    private	void writeObject(ObjectOutputStream os) throws IOException {
    	os.defaultWriteObject();
    	//encryotion
    	String bb=fond+"asqw";
    	os.writeObject(bb);
    	System.out.println("Encription :"+bb);
           	
    }
	 
    private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
    	is.defaultReadObject();
    	
    	//decription
    	String ab=(String) is.readObject();
    	ab=ab.substring(0,6);
    	System.out.println("Decryption :"+ab);
    	
    	
    	
    }
	
}
