package practice;

import java.util.Scanner;

public class cookie10156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int money = 0;
		
		if(K * N < M)
			money = 0;
		else 
			money = (K * N) - M;
		
		System.out.println(money);
	}
}
