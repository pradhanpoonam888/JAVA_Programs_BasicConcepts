package collectionsexamples;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack<String> st=new Stack<String>();
		
		st.add("aaaa");
		st.push("bbbb");
		st.push("cccc");
		st.push("dddd");
		st.push("eeee");
		st.push("aaaa");
		st.push("gggg");
		st.push("hhhh");
		st.push("iiii");
		
		printViaIterator(st);
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		
		printViaIterator(st);
	}

	private static void printViaIterator(Stack<String> st) {
		System.out.println("==========================================");
		Iterator<String> t=st.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		System.out.println("==========================================");
	}

}
