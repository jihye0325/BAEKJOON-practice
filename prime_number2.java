package practice;

import java.util.Scanner;

public class prime_number2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;	
		int min = N;
		int arr[] = new int[N - M + 1];
		
		for(int i = M; i <= N; i++) {
			int cnt = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				sum += i;
				if(i <= min)
					min = i;
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
