import java.util.*;

public class List_in_Collection {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add('a');
		al.add('b');
		System.out.println(al);

		al.remove(1);
		System.out.println(al);

		al.add(3);

		// duplicate insertion
		al.add('a');
		al.add("Siddhi");
		al.add(3, "Sid");
		System.out.println(al);
		System.out.println(al.get(3));

		// replace
		al.set(1, "Siddhi");
		System.out.println(al);

		// cursor (ListIterator)
		ListIterator ltr = al.listIterator();

		// iterating Arraylist using ListIterator object
		while (ltr.hasNext()) {
			Object object = (Object) ltr.next();
			if (object instanceof String) {
				System.out.println("\nIts  instance of String : " + object);
			} else {
				System.out.println("\nnot a instance of String : " + object);
				ltr.remove();
			}
		}

		System.out.println("\na1 after removing elements (not String instance): ");
		System.out.println(al);

		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Siddhi");
		nameList.add("Shivani");
		nameList.add("Loukik");
		nameList.add("Aadi");
		nameList.add("Avi");

		System.out.println("nameList :" + nameList);
		
		// cursor (Iterator)
		Iterator itr1 = nameList.iterator();

		System.out.println("\nnames having length > 5\n");
		while (itr1.hasNext()) {

			String s = (String) itr1.next();
			if (s.length() > 5) {
				System.out.print(s + " -_- ");
			}

		}
		
		LinkedListDemo ld = new LinkedListDemo();
		ld.addElements();
		ld.removeElements();
		
		VectorDemo vd = new VectorDemo();
		vd.addToVector();
		vd.iterate();

	}

}

class LinkedListDemo {

	public LinkedList<Integer> ageList = new LinkedList<Integer>();

	public void addElements() {

		for (int i = 1; i <= 10; i++) {
			ageList.addFirst(i * 5);
			ageList.addLast(i * 3);

		}

		System.out.println("\nageList : " + ageList);

	}

	public void removeElements() {
		System.out.println("\nnubers devisible by 5 :");
		for (int i = 0; i < ageList.size(); i++) {
			if (ageList.get(i) % 5 != 0) {
				ageList.remove(i);
			} else {
				System.out.print(ageList.get(i) + " - ");
			}

		}

		System.out.println("\nageList with divisible by 5 only : " + ageList);
	}

}

// Vector class 
class VectorDemo {
	Vector<String> v = new Vector<String>();

	public void addToVector() {
		v.add("Siddhi");
		v.add("Divya");
		v.add("Ayush");
		v.add("Pooja");
		v.add("Kiran");
		System.out.println(v);
	}
	public void iterate() {
		Enumeration e = v.elements();
		
		System.out.println("\nIterating vector list using Enumeration :-\n");
		while (e.hasMoreElements()) {
			String s = (String) e.nextElement();
			System.out.print(s +" -- ");
			
		}
	}
}
