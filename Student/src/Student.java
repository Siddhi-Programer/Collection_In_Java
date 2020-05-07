import java.lang.reflect.*;

 class Student {
	 
	private String name;
	private int rollNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}


 class Test{
	
	 public static void main(String[] args) throws ClassNotFoundException {
		 System.out.println("hello friends.........");
		 
		 
		 Teacher t = new Teacher();
		 System.out.println(String.class.getClassLoader());
		 System.out.println(Student.class.getClassLoader());
		 System.out.println(Test.class.getClassLoader());
		 System.out.println(Teacher.class.getClassLoader());
			/*
			 * Class c; c = Class.forName("Student"); Field[]f = c.getDeclaredFields();
			 * 
			 * for (Field field : f) { System.out.println("Field Name :- "+field); }
			 * System.out.println();
			 * 
			 * Method[] m = c.getDeclaredMethods();
			 * 
			 * for (Method m1 : m) { System.out.println("Method Name :- "+m1); }
			 * 
			 * Student s1 = new Student(); Class c1 = s1.getClass();
			 * 
			 * Student s2 = new Student(); Class c2 = s2.getClass();
			 * 
			 * System.out.println(); System.out.println(c1.hashCode());
			 * System.out.println(c2.hashCode()); System.out.println(c.hashCode());
			 */
	     
	  
	 }
}
