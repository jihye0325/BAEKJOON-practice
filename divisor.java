package practice;

import java.util.Scanner;

public class divisor2501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int arr[] = new int[N+1];
	
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				arr[i] = i;
			}
		}
		
			System.out.println(arr[K]);

	}

}
