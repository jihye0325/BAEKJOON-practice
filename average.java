package practice;

import java.util.Scanner;

public class average4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		for(int i = 0; i < C; i++) {
			int N = sc.nextInt();
			int[] sarr = new int[N];
			int sum = 0;
			
			for(int j = 0; j < N; j++) {
				sarr[j] = sc.nextInt();
				sum += sarr[j];
			}
			
			double avg = (double)sum / N;
			int cnt = 0;
			for(int j = 0; j < N; j++) {
				if(sarr[j] > avg)
					cnt++;
			}
			System.out.printf("%.3f%%\n", ((double)cnt / N) * 100);
				
		}
	}
}
