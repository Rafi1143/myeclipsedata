/*package xyza;

public class StringHandling {
   public static void main(String[] args){
	   System.out.println("Selenium");//string example
	   System.out.println("123Selenium");//string example
	   System.out.println("Selenium*&123");//string example
	   System.out.println("1234"); //string example 
}}*/ 
  
  
//Below is the example of how to declare string variable and Array of strings
/*package xyza;

public class StringHandling {
   public static void main(String[] args){
	   String myTool="Selenium"; // String variable
	   String[] myTools ={"UFT","Selenium","LoadRunner","RFT"}; // Array of strings
	   
	   System.out.println(myTool);
	   
	   for(String tool: myTools){
		   System.out.println(tool);
		   
} } }	

//Below is the example of how to declare Concatenating 

package xyza;

public class StringHandling {
 public static void main(String[] args){
	   String str1= "Selenium";
	   String str2= " Testing";
	   System.out.println(str1+str2);// string plus string the process is concatenating
	   System.out.println("Selenium"+(1+1));// Selenium is String , 1 is integer-the process is called Concatenation
	   System.out.println("Selenium"+1+1);
	   System.out.println("5"+1+"Selenium");//step 1 - 1 is integer ,1 is integer - process addition 
	                                      //step 2-2 is integer ,Selenium is string,- process is concatenation 
	   System.out.println("Selenium"+   "");System.out.println(  " " +"Selenium");
		   
} }*/ 	


//String example 


//String example 

package xyza; // String comparison example 

public class StringHandling {
 public static void main(String[] args){
	   String str1= "selenium";
	   String str2= " SELENIUM";
	   String str3= " SELENIUM";
	   String str4= " zselenium";
	   
		   // String comparison using == operator 
	   System.out.println(str1==str2);
	   System.out.println(str2==str3);
	   
	   //String comparison using equals() method
	   System.out.println(str1.equals(str2));
	   System.out.println(str2.equals(str3));
	   
	   //String comparison using compareTo() method
	   System.out.println(str1.compareTo(str2));
	   System.out.println(str2.compareTo(str3));
	   System.out.println(str1.compareTo(str4));
} }