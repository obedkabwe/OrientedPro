package exercises3;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		
		student.name = sc.nextLine();
		
		
		student.primeiro = sc.nextDouble();
		
		
		student.segundo = sc.nextDouble();
		
		
		student.terceiro = sc.nextDouble();
		
		System.out.println("FINAL GRADE" + "=" +  student.finalGrade());   
		
		if (student.finalGrade() < 60) {
			System.out.println("FAILL");
			System.out.println("STUDENT MISSING" + ":" + student.missing() + "" +  "pts");
		}else {
			System.out.println("PASS");
		}
		
		
	}

}
