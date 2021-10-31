package for_practice;

import java.util.Scanner;

public class AplusB8_11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int result = 0;
		
		for(int i = 0; i < x; i ++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			result = a + b;
			System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + result); 
		}

	}

}
