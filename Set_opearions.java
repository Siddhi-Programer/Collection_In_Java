import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Auther : Sidheshwari
public class Set_opearions {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add(1);
		l.add('A');
		l.add(2);
		l.add('B');
		l.add('A');

		System.out.println("Arraylist l : " + l);

		HashSet hs = new HashSet();
		hs.add(true);
		hs.addAll(l);
		hs.add('A');
		hs.add("Siddhi");
		hs.add("Kiran");
		hs.add("Onkar");
		System.out.println(hs.add('A')); // duplicates not allowed in set objects

		System.out.println("Hashset hs : " + hs); // insertion order not preserved

		LinkedHashSet linked_hs = new LinkedHashSet();
		linked_hs.addAll(l);
		linked_hs.add(10);
		linked_hs.add('k');
		linked_hs.add(111);
		System.out.println(linked_hs); // insertion order not preserved

		// TreeSet Operation
		TreeSetOperation ts = new TreeSetOperation();
		ts.create_Treeset_asc_order();
		ts.create_Treeset_Desc_order();
		
		// adding Employee objects in Treeset 
		 TreeSet< Employee> empSet = new TreeSet<Employee>();
		  empSet.add(new Employee(1,"Siddhi"));
		  empSet.add(new Employee(10,"Sayali"));
		  empSet.add(new Employee(5,"Kesar"));
		  empSet.add(new Employee(3,"Siddhant"));
		  empSet.add(new Employee(4,"Ankita"));
		  empSet.add(new Employee(5,"Shubham"));
		  empSet.add(new Employee(5,"Shubham"));
		  
		  System.out.println("\n"+empSet);

	}

}

class TreeSetOperation {

	void create_Treeset_asc_order() {

		// internally TreeSet(new Comparable()) get called
		// which has obj1.CompareTo(Obj2) metthod
		// Comparable's compareTo(Object obj) used for Natural sorting order

		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(5);
		ts.add(5);
		ts.add(6);
		ts.add(1);
		ts.add(100);
		ts.add(123);
		System.out.print("\nTreeSet with Ascescending order : ");
		System.out.print(ts); // sorted Treeset

	}

	void create_Treeset_Desc_order() {

		// customized sorting order 
		// MyComparators  compare(Object obj1,Object obj2) used for Customized sorting order

		TreeSet<Integer> ts = new TreeSet<Integer>(new MyComparator());

		ts.add(5);
		ts.add(5);
		ts.add(6);
		ts.add(1);
		ts.add(100);
		ts.add(123);
		System.out.print("\nTreeSet with Descending order : ");
		System.out.print(ts); // sorted Treeset

	}

}

// used to get Customized Sorting order 
class MyComparator implements Comparator {

	@Override
	public int compare(Object arg1, Object arg2) {
		Integer i1 = (Integer) arg1;
		Integer i2 = (Integer) arg2;

		// 1st way : return - i1.compareTo(i2);

		// 2nd way
		if (i1 < i2) {
			return 1;
		} else if (i1 > i2) {
			return -1;
		} else {
			return 0;
		}
	}

}

class Employee implements Comparable{
	int empId;
	String name;
	
	Employee(int empId, String name){
		this.empId = empId;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Object obj) {
		 int eid1 = this.empId;
		 Employee emp2 = (Employee) obj ;
		 int eid2 = emp2.empId;
		 
		 if(eid1 < eid2  ){
			return -1 ;
		} else if(eid1 > eid2){
			return 1 ;
		} else {
			return 0;
		}
	}
}
