package practice;

import java.util.Scanner;

public class receipt5565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int arr[] = new int[9];
		int atotal = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			atotal += arr[i];
		}
		
		int result = total - atotal;
		
		System.out.println(result);

	}

}
