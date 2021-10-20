package practice;

import java.util.Scanner;

public class multiplication2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
	
		int r1 = N1 * (N2 % 100 % 10);
		int r2 = N1 * (N2 % 100 / 10);
		int r3 = N1 * (N2 /100);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r3 * 100 + r2 * 10 + r1);

	}

}
