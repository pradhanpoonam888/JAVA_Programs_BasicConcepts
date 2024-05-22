package SerializationNDeSer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.w3c.dom.css.Rect;

public class Rectangle implements Serializable{
	int length;
	int breadth;
	int area;
	
	public int getLength() {
		return length;
	}
	
	public int getbreadth() {
		return breadth;
	}

	public Rectangle() {

	}

	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
		area =	length	*	breadth;
	}

	public static void main(String[] args) {
		Rectangle r=new Rectangle(5,6);
		serialize(r);
		
		deserialize();
	}

	/**
	 * 
	 */
	public static void deserialize() {
		try {
			FileInputStream fis=new FileInputStream("Rectangle.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Rectangle r2=(Rectangle) ois.readObject();
			System.out.println("Lenght : "+r2.getLength());
			System.out.println("Lenght : "+r2.getbreadth());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param r
	 */
	public static void serialize(Rectangle r) {
		try {
			
			FileOutputStream fio;
			fio = new FileOutputStream("Rectangle.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fio);
			oos.writeObject(r);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
