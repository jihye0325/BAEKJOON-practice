package practice;

import java.util.Scanner;

public class score_sum5596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int S =  0;
		int T = 0;
		
		for(int i = 0; i < 4; i++) {
			S += sc.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			T += sc.nextInt();
		}
		
		if(S > T) {
			System.out.println(S);
		} else if( T > S) {
			System.out.println(T);
		} else {
			System.out.println(S);
		}
	}

}
