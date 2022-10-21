package lab3;
import java.io.*;
import java.util.*;
public class Ex3 {
	public static boolean isVowel(char ch) {
        char ip = Character.toUpperCase(ch);
        if (ip == 'A'|| ip == 'E'|| ip == 'I'|| ip == 'O'|| ip == 'U')
            return true;
        else
            return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		
		String newStr= new String();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			boolean f1 = isVowel(ch);
            if (f1) {
                newStr = newStr + ch;
            }
            else {
                char ch2 = (char)(ch - 1);
                boolean f2 = isVowel(ch2);
                if (f2) {
                    ch2 = (char)(ch + 1); 
		}
                newStr = newStr + ch2;
	}

}
		System.out.println(newStr);
	}
}
