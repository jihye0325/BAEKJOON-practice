package practice;

import java.util.Scanner;

public class print_ten_words11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		for(int i = 0; i < st.length(); i++) {
			System.out.print(st.charAt(i));
			if(i % 10 == 9) {
				System.out.println();
			}
			
		}

	}

}
