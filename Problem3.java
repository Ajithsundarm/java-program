package ex;

import java.util.Scanner;

public class Problem3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		if(num % 2==0) {
			num=num-1;
		}
		int j=1;
		
		for(int i=1;i<=num;i++) {
		
			if(j % 2 ==1) {
				System.out.println(j);
			
			}
			j=j+2;
			
		}	
	}	

}
