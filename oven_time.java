package practice;

import java.util.Scanner;

public class oven_time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(B + C >= 60) {
			A += (B + C) / 60;
			B = (B + C) % 60;
		} else {
			B = B + C;
		}
		
		if(A >= 24) {
			A -= 24;
		}
		System.out.println(A + " " + B);
	}

}
