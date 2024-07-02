import java.util.Iterator;
import java.util.Vector;

public class EX10 {
	public static void main(String[] args) {
		
		//382 page
		
		Vector<E> v = new Vector();
		for (int i = 1; i <= 5; i++) {
			v.add(i);
		}
		System.out.println("v : " + v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println("================================================");
			
			Iterator<E> iter = v.iterator();
			while(iter.hasNext()) {
				System.out.print(iter.next() + " ");
			}
		}
	}
}
