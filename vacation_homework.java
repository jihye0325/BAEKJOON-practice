package practice;

import java.util.Scanner;

public class vacation_homework5532 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		double A = sc.nextInt();
		double B = sc.nextInt();
		double C = sc.nextInt();
		double D = sc.nextInt();
		
		int kor = (int) Math.ceil(A / C);
		int math = (int)Math.ceil(B / D);
		
		if(kor > math) {
			System.out.println(L - kor);
		} else {
			System.out.println(L - math);
		}

	}

}
