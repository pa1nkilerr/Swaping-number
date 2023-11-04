package swap;

import java.util.Scanner;

public class TempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		int num1= input.nextInt(); //int a= num1 num1=27
		int num2= input.nextInt(); //int b= num2 num2=35 
		
		int temp=0;
		
		temp= num1;
		num1= num2;
		num2= temp;
	                  //start swapping with num1 or num2 doesn't matter
		
    /*  temp= num2;
		num2= num1;
		num1= temp;
	*/
		
		System.out.println(num1);
		System.out.println(num2); 
		
	}

}
