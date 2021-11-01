package practice;

import java.util.Scanner;

public class OXquiz8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arr[] = new String[sc.nextInt()];
		sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}

		for(int i = 0; i < arr.length; i++) {
			int cnt = 0;
			int sum = 0;
			
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].toUpperCase().charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				
				sum += cnt;
			}
			System.out.println(sum);
		}
	}

}
