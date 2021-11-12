package practice;

import java.util.Scanner;

public class vowel10987 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char arr[] = {'a', 'e', 'i', 'o', 'u'};
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < arr.length; j++) {
				if(str.charAt(i) == arr[j])
					cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
