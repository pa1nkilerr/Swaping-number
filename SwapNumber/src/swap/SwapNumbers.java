package swap;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter first value: ");
		
		int num1= input.nextInt();
		
		System.out.print("Enter second value: ");
		
		int num2= input.nextInt();
		
		System.out.println("Before swapping: ");
		System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);
		
		int temp= 0;
		
		temp= num1;
		num1= num2;
		num2= temp;
		
		System.out.println("After swapping: ");
		System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);
		
	}

}
