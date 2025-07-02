package ex;

import java.security.DomainLoadStoreParameter;
import java.util.Scanner;

public class Problem1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Choose the method:");
	String choose = sc.next();
	System.out.println("Enter input 1:");
	double a = sc.nextDouble();
	System.out.println("Enter input 2 :");
	double b = sc.nextDouble();
	double Output;
	switch(choose){
	case"Add":
		 Output = a+b;
		System.out.println("Output"+ Output);
		break;
	case"Sub":
		 Output = a-b;
		System.out.println("Output"+ Output);
		break;
    case"Div":
	    Output = a/b;
		System.out.println("Output"+ Output);
		break;	
	case"Mul":
		 Output = a*b;
		System.out.println("Output"+ Output);
		break;
	}	
	}
}