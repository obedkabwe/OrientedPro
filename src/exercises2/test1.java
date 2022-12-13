package exercises2;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Employee empl = new Employee();
		

		System.out.println("Name" + ":" + empl.name);
		empl.name = sc.nextLine();
		System.out.println("GROSSSALARY" + ":" + empl.grossSalary);
		
		empl.grossSalary = sc.nextDouble();
		
		System.out.println("TAX" + ":" + empl.tax);
		empl.tax = sc.nextDouble();
		
		
		

		//empl.increaseSalary(10.00);
		System.out.println("EMployee" + ":" + empl);
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		empl.increaseSalary(percentage);
		System.out.println("Updated data:" + empl);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
