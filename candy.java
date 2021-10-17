package practice;

import java.util.Scanner;

public class candy10178 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
	
		for(int i = 0; i < N; i++) {
			int c = sc.nextInt();
			int v = sc.nextInt();
			
			System.out.println("You get " + c/v + " piece(s) and "
					+ "your dad gets " + c%v + " piece(s).");
		}
		

	}

}
