package Collections.Vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class TestVector1 {
	

	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();
		
		vec.add("test1");
		vec.addFirst("test23");
		vec.addElement("Poonam"); // Specific function of Vector
		vec.addElement("test23"); 
		vec.addElement("rty"); 
		vec.addElement("kyuii"); 
		vec.addElement("werty"); 
		vec.addElement("Shanaya"); 
		
		
		System.out.println(vec);
		
		vec.removeElement("test23");
		
		System.out.println(vec);
		
		Collections.sort(vec);
		
		System.out.println(vec);
		
		
		// traversing is done via Enumeration
		
		Enumeration e=vec.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
