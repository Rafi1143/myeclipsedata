package xyza;

public class FlowControl {
	public static void main(String [] args){
		
		int a = 2;
		
		if ((a>=1) && (a<=100)){
			System.out.println("A is a small number");
		}
		
		else if ((a>=100) && (a<=1000)){
				System.out.println("A is a medium number");
		}
		else if ((a>=1000) && (a<=10000)){
			System.out.println("A is a big number");
			
		}
	
		else if (a>10000) {
			System.out.println("A is a high number");
		}

		else 
		{
			System.out.println("A is either 0 or Negative number");
		}
		
}
	

}
