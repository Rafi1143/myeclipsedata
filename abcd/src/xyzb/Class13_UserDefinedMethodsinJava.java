/*package xyzb;

public class Class13_UserDefinedMethodsinJava {
	
	// 1) Writing Methods (With returning a value)
    // a) Syntax for creating a method (calling the method by invoking object)

	
	// user defined method
	//access modifier return type method Name
	public int multiply (int a, int b, int c) {
	// public is access modifier ; int is return type;method name is multiply
	   int result = a*b*c;
	   return result;
}

public static void main (String [] args) {
	// create object
	// ClassName objectName = new ClassName() ;
	Class13_UserDefinedMethodsinJava abc= new Class13_UserDefinedMethodsinJava();
	
	// className is = Class13_UserDefinedMethodsinJava
	// objectName is abc (we can put any name)
	
	
		
	// call method 
	// dataType variableName = object.method(values..);
	   int x = abc.multiply(2,2,2);
	   System.out.println(x);
	   System.out.println(abc.multiply(2, 2, 2));// both are correct way to show result
}


}*/

// // 1) Writing Methods (With returning a value)
// a) Syntax for creating a method (calling the method without object)


/*package xyzb;

public class Class13_UserDefinedMethodsinJava {
	
// create method 
// accessModifier nonAccessModifier returnType methodName(Parameters){ }	

	public static int multiply (int a ,int b, int c) {
	// access modifier = public
	// non access modifier =static
	// return type = int
	// method name = multiply 
	//parameters = int a, int b, int c	
		
	 int result = a*b*c;
	 return result;
		
	}
	
	//main method
	
	public static void main (String [] args) {
		
		//call method
	//dataType variableName = methodName(values);
		int x = multiply(2,2,2);
	// datatype = int
	// variable name =x,we can give any name
	// methodname = multiply
		
	// display statement
		
	System.out.println(x);
	
	System.out.println(multiply (2,2,2));
		
		
	}
	
}	
	*/
	
	

/*// Write method without returning any value
// call the method by invoking Object
package xyzb;

public class Class13_UserDefinedMethodsinJava { 

	// create method 
//accessModifier returnTypeNothing methodName(parameters){ }
	public void studentRank(int marks){
	// access modifier = public
	// returnType Nothing= void
	// methodName =StudentRank
	//parameters = int marks	
		
	if (marks>=600) {
		System.out.println("Rank A");
	}	
	else if (marks >= 500){
		System.out.println("Rank B");
	}
	else 
		System.out.println("Rank c");
	}
	
// main method
	
	public static void main (String [] args) {
		// create object
	//ClassName objectName = new ClassName();	
		
Class13_UserDefinedMethodsinJava obj = new Class13_UserDefinedMethodsinJava ();
// className = Class13_UserDefinedMethodsinJava
// Object name =obj


// call method
//object.method(values);

obj.studentRank(200);
		
		
	}
	
		
}*/
	
// 2) Write method without returning any value
// b) Syntax for creating a Method (call the method without Object)

	
package xyzb;

public class Class13_UserDefinedMethodsinJava { 
	
//accessModifier nonAccessModifier returnTypeNothing methoName(Parameters){}	

	public static void StudentRank(int marks){
// access modifier= public
// non access modifier = static
// return type nothing = void
// methodname = StudentRank

		if (marks>= 600) {
			
			System.out.println("Rank A");
		}
		else if (marks>=500){
			System.out.println("Rank B");
		}	
		else {
			System.out.println("Rank c");
		}
	}
		
public static void main( String [] args){
	
	// call method
	
	StudentRank(5000);
	
	
}
	

	
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


