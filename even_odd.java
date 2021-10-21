package practice;

import java.util.Scanner;

public class even_odd5988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int K = sc.nextInt();			
			String result = (K % 2 == 0) ? "even" : "odd";
			System.out.println(result);
		}
	}
}
