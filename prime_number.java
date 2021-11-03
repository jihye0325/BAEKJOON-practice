package practice;

import java.util.Scanner;

public class prime_number1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int prime_num = 0;
		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			int cnt = 0;
			for(int j = 1; j <= num; j++) {
				if(num % j == 0)
					cnt++;
			}
			
			if(cnt == 2) 
				prime_num++;
		}
		
		System.out.println(prime_num);

	}

}
