package practice;

import java.util.Scanner;

public class cook1260 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				score[i] += sc.nextInt();
			}
		}
	
		int winner = 0;
		for(int i = 1; i < 5; i++) {
			if(score[winner] < score[i])
				winner = i;
		}
		
		System.out.println((winner + 1) + " " + score[winner]);
	}

}
