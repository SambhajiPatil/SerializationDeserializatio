package Demos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class testSeriwithoutCust {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	    A a=new A();
	    
	    
	    File file=new File("E:\\Scoopen\\Notes\\abc.txt");
	    
	    FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a);
        fos.close();
        oos.close();
        
        System.out.println("serialization completed");             
        System.out.println("after Seriliazation user : "+a.uname);
        System.out.println("after Seriliazation pass : "+a.pass);
        
        
        FileInputStream fin=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fin);
        A a1=(A) ois.readObject();
        fin.close();
        ois.close();
       
        System.out.println("DEsrialization Completed");
        System.out.println("after Deseriliazation user : "+a1.uname);
        System.out.println("after Deseriliazation pass : "+a1.pass);
        
        
	}

}



class A implements Serializable{
	
	public String uname="patil";
	transient public String pass="sam123@";
	
	
}
