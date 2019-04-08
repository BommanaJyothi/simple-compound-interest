// program for calculating the simple interest and compound interest
//importing required libraries
import java.lang.Math;
import java.util.Scanner;

class program{
	
	// function for calculating Simple interest
	void Simple_Interest(){
		double p,t,r,SI;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the principle amount\n");
		p=sc.nextDouble();
		System.out.println("enter the  rate of interest\n");
		t=sc.nextDouble();
		System.out.println("enter the time perion\n");
		r=sc.nextDouble();
		
		SI= (p*t*r/100);
		
		// printing the simple interest for the given inputs from the user
		
		System.out.println("Simple interest: "+ SI +"\n");
	}
	
	// function for calculating the compound interest
	void Compound_Interest(){
		double p,n,r,CI;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the principle amount\n");
		p=sc.nextDouble();
		System.out.println("enter the  rate of interest\n");
		r=sc.nextDouble();
		System.out.println("enter the time perion\n");
		n=sc.nextDouble();
		
		CI= p*(Math.pow((1+(r/100)),n)); 
		
		// printing the compound interest for the given inputs from the user
		
		System.out.println("Compound interest: "+ CI +"\n");
	}
	
}

class Simple_Compound_interest{
	
	// main method
	
	public static void main(String args[]){
		// creating an instace for the class program
		program p = new program();
		
		// calling methods of an object
		
		p.Simple_Interest();
		p.Compound_Interest();
		
			
	}
}