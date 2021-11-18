package practice;

import java.util.Scanner;

public class cute10886 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int y = 0;
		int n = 0;
		
		for(int i = 0; i < N; i++) {
			int answer = sc.nextInt();
			if(answer == 1)
				y++;
			else 
				n++;
		}
		
		if(y > n) 
			System.out.println("Junhee is cute!");
		else 
			System.out.println("Junhee is not cute!");

	}

}
