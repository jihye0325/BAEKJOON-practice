package practice;

import java.util.Scanner;

public class triangle4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			
			if(n1 == 0 && n2 == 0 && n3 == 0) {
				break;
			}
			
			if(n1 * n1 == (n2 * n2) + (n3 *n3)){
				System.out.println("right");
			} else if(n2 * n2 == (n1 * n1) + (n3 *n3)) {
				System.out.println("right");
			} else if(n3 * n3 == (n1 * n1) + (n2 *n2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}
