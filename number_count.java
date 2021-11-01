package practice;

import java.util.Scanner;

public class number_count2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		
		int result = A * B * C;
		String str = String.valueOf(result);
				
		for(int i = 0; i < 10; i++) {
			int cnt = 0;
			for(int j = 0; j < str.length(); j++){
				if((str.charAt(j)-48) == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
