package lab6;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		HashMap<Character, Integer> countChar = new HashMap<>();
		for(int i=str.length()-1; i>=0; i--) {
			if(countChar.containsKey(str.charAt(i))) {
				int count = countChar.get(str.charAt(i));
				countChar.put(str.charAt(i), ++count);
				
			}else {
				countChar.put(str.charAt(i), 1);
			}
		}
		System.out.println(countChar);

	}

}
