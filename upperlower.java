package practice;

import java.util.Scanner;

public class upperlower2744 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String nword = "";
		
		for(int i = 0; i < word.length(); i++) {
			if(Character.isUpperCase(word.charAt(i))) {
				nword += String.valueOf(word.charAt(i)).toLowerCase();
			} else {
				nword += String.valueOf(word.charAt(i)).toUpperCase();
			}
		} System.out.println(nword);

	}

}
