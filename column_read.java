package practice;

import java.util.Scanner;

public class column_read10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] arr = new char[5][15];
		
		for(int i = 0; i < arr.length; i++) {
			String str = sc.nextLine();
			
			for(int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[j][i] == ' ' || arr[j][i] == '\0')
					continue;
				
				System.out.print(arr[j][i]);
			}
		}
	}
}
