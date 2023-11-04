package swap;

import java.util.Scanner;

public class SwapNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		
		String name1= input.nextLine();
		
		System.out.print("Enter second name: ");
		
		String name2= input.nextLine();
		
		System.out.println("Before swapping: ");
		System.out.println("name1= " + name1);
		System.out.println("name2= " + name2);
		
		String temp= " ";
		
		temp= name1;
		name1= name2;
		name2= temp;
		
		System.out.println("After swapping: ");
		System.out.println("name1= " + name1);
		System.out.println("name2= " + name2);
		
	}

}
