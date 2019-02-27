package xyza;

public class VariablesExample {
	// a variable is a Class or Static variable 
	static int a=100;
	
	// mysalary is declared with in the method,so it called local variable 
	public int salary () {
		int mysalary =10000+2000+1500;
		mysalary= mysalary + a;
		return mysalary; 
	}
	
	public static void main(String[]args){
		// Below is instance variable , as it declared after the main method 
		int b=200;
		System.out.println(a);
		System.out.println(b);
		
	// To access user defined method , we have to create object in the main method
		VariablesExample obj= new VariablesExample();
		 System.out.println(obj.salary());
		 
	// i is a local variable 	
		 for (int i=1; i<=5;i++){
			 System.out.println(i);
			 System.out.println(a);
			 System.out.println(b);
		 }

	
	}
	

}
