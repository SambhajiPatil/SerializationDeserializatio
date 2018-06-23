package NeedOfserialVersionUID;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class testSerialVersion {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		player p=new player(12,45,1);
		
		//player p=new player(12,45);
		
		/*FileOutputStream fos=new FileOutputStream("sss.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
		System.out.println("serialization");
		*/
	    FileInputStream fis=new FileInputStream("sss.txt");
	    ObjectInputStream ois=new ObjectInputStream(fis);
	    player p2=( player)ois.readObject();
		
	    
	    System.out.println("deserialization");
	

	}

}

class player implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int height;
	int weight;
	int b;
	
	/*public player(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}*/
	public player(int height, int weight,int b) {
		super();
		this.height = height;
		this.weight = weight;
		this.b=b;
	}

	@Override
	public String toString() {
		return "player [height=" + height + ", weight=" + weight + ", b=" + b + "]";
	}
	
	
	
/*	public String toString() {
		return "player [height=" + height + ", weight=" + weight + "]";
	}*/
	
	
}
