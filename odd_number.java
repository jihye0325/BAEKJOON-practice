package practice;

import java.util.Scanner;

public class odd_number2576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int min = 100;
		
		for(int i = 0; i < 7; i++) {
			int num = sc.nextInt();
			
			if(num % 2 == 1 ) {
				sum += num;
				if(min >= num)
					min = num;
			}
		}
		
		if(sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);			
		}

	}

}
