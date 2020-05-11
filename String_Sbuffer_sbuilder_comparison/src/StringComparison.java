import java.util.Scanner;

// Auther : Sidheshwari 
public class StringComparison {

	public static void main(String[] args) {

		String s1 = "Siddhi";
		String s2 = "Siddhi";
		String s3 = "Shetty";

		System.out.println(" ******* StringBuffer equals() behaviour ******* \n");

		System.out.println(s1 == s2); // == : refference Comparison
		System.out.println(s1.equals(s2)); // equals() : content Coparison in String

		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s1.eqauls(s3) : " + s1.equals(s3));

		String s4 = new String("Pune");
		String s5 = new String("Pune");

		System.out.println("s4 == s5 : " + (s4 == s5));
		System.out.println("s4.equals(s5) : " + s4.equals(s5));

		// StringBuffer equals() method
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		System.out.println("\n ******* StringBuffer equals() behaviour *******\n");

		System.out.println("sb1 == sb2 : " + (sb1 == sb2)); // Referrence comparison
		System.out.println("sb1.eqauls(sb2) : " + sb1.equals(sb2)); // Referrence comparison

		System.out.println("\n ******* StringBuilder equals() behaviour *******\n");

		StringBuilder sB11 = new StringBuilder("Zoya");
		StringBuilder sB22 = new StringBuilder("Zoya");

		System.out.println("sB11 == sB22 : " + (sB11 == sB22)); // Referrence comparison
		System.out.println("sB11.eqauls(sB22) : " + sB11.equals(sB22)); // Referrence comparison

		// immutable nature of String
		System.out.println("\nChecking immutable nature of String\n");
		String name1 = new String("Shivani");
		System.out.println("String name1 - Before Concatination :" + name1);
		name1.concat("Shah");
		System.out.println("String name1 - After Concatination :" + name1);
		String newName = name1.concat("Shah");
		System.out.println("returned String newName - after Concatination with name1 :" + newName);

		// mutable nature of StringBuffer and StringBuilder
		System.out.println("\nChecking utable nature of StringBuffer and StringBuilder\n");
		StringBuffer name11 = new StringBuffer("Ankita");
		System.out.println("StringBuffer name11 - Before append :" + name11);
		name11.append("_Rani");
		System.out.println("StringBuffer name11 - After append :" + name11);

		StringBuilder name101 = new StringBuilder("Janavi");
		System.out.println("\nStringBuilder name101 - Before append :" + name101);
		name101.append("_Rani");
		System.out.println("StringBuilder name101 - After append :" + name101);
		
		// String methods 
		System.out.println("String methods :");
		String myName = new String("Sidheshwari Sajjanshetty");
		System.out.println(myName.length());
		System.out.println(myName.charAt(2));
		System.out.println(myName.substring(5));
		System.out.println(myName.substring(0, 3));
		System.out.println(myName.equalsIgnoreCase("sidheShwari"));
		System.out.println(myName.indexOf('x'));
		System.out.println(myName.lastIndexOf('s'));
		System.out.println(myName.concat(" abc"));
		

		// calling immutable class methods
		Student stu1 = new Student(1, "Siddhi");
		System.out.println(stu1.modify("Siddhi"));
		System.out.println(stu1.modify("Shetty"));

	}

}

// immutable class Student 
class Student {
	private int rollno;
	private String name;

	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

	public Student modify(String newName) {

		if (this.name == newName) {
			System.out.println("\nStudent already exist with this name.");
			return this;
		} else {
			System.out.println("\nyou entered newName : " + newName);
			Scanner sc = new Scanner(System.in);
			System.out.println("please Enter roll no:");
			int inputRoll = sc.nextInt();
			return new Student(inputRoll, newName);
		}

	}
}
