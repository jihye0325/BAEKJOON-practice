package for_practice;

import java.util.Scanner;

public class muliplication2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N >=1 && N <= 9) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(N + " * " + i + " = " + (N*i));
			}
		}
	}
}