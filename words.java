package practice;

import java.util.Scanner;

public class words1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine().trim();
		
		if(words.isEmpty()) {
			System.out.println(0);
		} else {
		String[] wordarr = words.split(" ");
		System.out.println(wordarr.length);
		}
	}
}
