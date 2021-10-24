package practice;

import java.util.HashMap;
import java.util.Scanner;

public class bestSeller1302 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
		for(int i = 0; i < N; i++) {
			String name = sc.nextLine();
			
			if(map.containsKey(name)) {
				map.put(name, map.get(name) + 1);
			} else {
				map.put(name, 1);
			}
		}
		
		int max = 0;
		String str = "";
		for(String key : map.keySet()) {
			if(max < map.get(key)) {
				max = map.get(key);
				str = key;
			} else if(max == map.get(key)) {
				if(key.compareTo(str) < 0) {
					str = key;
				}
			}
		}
		
		System.out.println(str);
		
	}

}
