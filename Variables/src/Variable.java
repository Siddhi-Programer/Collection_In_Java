// Auther - Siddhi 

// Types of variables 
// instance var, Static var , local var 
// Static var vs Non-static var 

public class Variable {

	static int x; 
	 static int d = 10 ;
	int y;
	int z =10;

	public static void main(String[] args) {

		//accessing Static Variable in Static area 
		System.out.println("value of Static var - x from Static method directly :" + x);
		x++;
		System.out.println("value of Static var - x from Static method using className :" + Variable.x);
		
		System.out.println("\nvalue of Static var - d from Static method directly :" + d);
		System.out.println("value of Static var - d from Static method using className :" + Variable.d);
		
		// can not make Static refference to non-static field
		// System.out.println("value of y :"+y);

		Variable v = new Variable();
		v.m1();
		System.out.println("\nwe can not access non-static var from Static area directly ");
		System.out.println("we can access non-static var from Static area using object refference only ");
		
		System.out.println("\ndefault value of instance variable -y from Static area using object refference:"+v.y);
		System.out.println("instance variable z from Static area using object refference:"+v.z);
          
		v.d = v.d +5;
	    System.out.println("\nStatic variable d from Static area using object refference v:"+v.d);
	    Variable v1 = new Variable();
	    System.out.println("Static variable d from Static area using object refference v1:"+v1.d);
	    v1.d = v1.d +2;
	    System.out.println("Static variable d from Static area using object refference v:"+v.d);
	}  
	
	public void m1() {
		//local var
		int a;
		// CE :the local variable may not have been initilized
		//System.out.println(a);
		int b =10;
		System.out.println("local var b :"+b);
		System.out.println("\nvalu of Static var - x from Non-static method directly  :"+x);
		System.out.println("valu of Static var - d from Non-static method using ClassName :"+Variable.d);
		System.out.println("Accesing non-static var from non-static method directly :"+z);
	}

}

// output 
/* 
value of Static var - x from Static method directly :0
value of Static var - x from Static method using className :1

value of Static var - d from Static method directly :10
value of Static var - d from Static method using className :10
local var b :10

valu of Static var - x from Non-static method directly  :1
valu of Static var - d from Non-static method using ClassName :10
Accesing non-static var from non-static method directly :10

we can not access non-static var from Static area directly 
we can access non-static var from Static area using object refference only 

default value of instance variable -y from Static area using object refference:0
instance variable z from Static area using object refference:10

Static variable d from Static area using object refference v:15
Static variable d from Static area using object refference v1:15
Static variable d from Static area using object refference v:17  
*/
