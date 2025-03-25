package programs;

import java.util.Scanner;

public class PrintInitial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter middle name: ");
		String middleName = sc.nextLine();
		System.out.println("Enter last name: ");
		String lastName = sc.nextLine();
		
		System.out.println(firstName.charAt(0)+""+middleName.charAt(0)+""+lastName.charAt(0));
		
		sc.close();



	}
	

}
