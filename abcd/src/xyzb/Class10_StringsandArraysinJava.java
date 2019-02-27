package xyzb;

/*public class Class10_StringsandArraysinJava {
	public static void main(String [] args){
		System.out.println("Selenium");
		System.out.println("123Selenium");
		System.out.println("Selenium*&123");
		
	}

}*/

/*public class Class10_StringsandArraysinJava{
	public static void main (String [] args) {
	
		String myTool ="Selenium" ;// string variable ,myTool is String name,we can use any name 
		
		String [] myTools= {"UFT","Selenium","LoadRunner","RFT","123","12Sel"}; // array of string,this syntax is for array of string
		
		System.out.println(myTool);
		 
		for (String tool: myTools) {
			System.out.println(tool);
		}
	 
	}
	
}*/

// concatenation 
public class Class10_StringsandArraysinJava{
	public static void main (String [] args) {
		
		String str1= "selenium";
	    String str2= "  Testing";
	    System.out.println(str1+str2);// result is seleniumtesting
	    System.out.println("Selenium" +1+1); // result is Selenium11
	    System.out.println(1+1+"Selenium" ); // result is 2selenium
		
	}
	}