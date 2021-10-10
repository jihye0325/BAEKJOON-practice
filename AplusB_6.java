package practice;

import java.util.Scanner;

public class AplusB_6_10953 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < size; i++) {
			String[] arr = sc.next().split(",");
			System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));

		
		}
		

	}

}
