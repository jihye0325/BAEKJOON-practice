package practice;

import java.util.Scanner;

public class plusNumber9085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int sum = 0;
			int N = sc.nextInt();
			
			int arr[] = new int[N];
			for(int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			System.out.println(sum);
			sum = 0;
		}
	}

}
