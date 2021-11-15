package practice;

import java.util.Scanner;

public class myScore10984 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int sum = 0;
		double result = 0.0;
		
		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int[] point = new int[N];
			double[] GPA = new double[N];
			
			for(int j = 0; j < N; j++) {
				point[j] = sc.nextInt();
				GPA[j] = sc.nextDouble();
			}
			
			for(int k = 0; k < N; k++) {
				sum += point[k];
			}
			
			for(int l = 0; l < N; l++) {
				result  += (double)point[l] * GPA[l];
			}
			
			System.out.println(sum + " " + Math.round(result*10/sum)/10.0);
			sum = 0; 
			result = 0;
		}
	}
}
