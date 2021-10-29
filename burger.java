package practice;

import java.util.Scanner;

public class burger5543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int burger[] = new int[3];
		int drink[] = new int[2];
		int min1 = 2001;
		int min2 = 2001;
		
		for(int i = 0; i < 3; i++) {
			burger[i] = sc.nextInt();
			if(burger[i] < min1) 
				min1 = burger[i];
		}
		
		for(int i = 0; i < 2; i++) {
			drink[i] = sc.nextInt();
			if(drink[i] < min2) 
				min2 = drink[i];
		}
		
		System.out.println(min1 + min2 - 50);
	}
}
