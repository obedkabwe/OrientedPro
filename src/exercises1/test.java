package exercises1;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		
		 rec.width= sc.nextDouble();
		 rec.height = sc.nextDouble();
		
		
		
		System.out.println("AREA" + "=" + rec.area());
		System.out.println("PERIMETER" + "=" + rec.perimeter());
		System.out.println("DIAGONAL" + "=" + rec.diagonal());
		
		
		
		
		
		
		sc.close();
		
		
		
		
	}

}
