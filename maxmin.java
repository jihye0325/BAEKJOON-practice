package practice;

import java.util.Scanner;

public class maxmin10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	
		int[] arr = new int[N];
		if(N >= 1 && N <= 1000000) {
			for(int i = 0; i < N; i ++) {
				arr[i] = sc.nextInt();
			}
		}
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < N; i++) {
			if(min > arr[i]) 
				min = arr[i];
			
			if(max < arr[i])
				max = arr[i];
		}
		
		System.out.println(min + " " + max);
		
		
	}
}
