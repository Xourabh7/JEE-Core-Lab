package lab3;
import java.util.*;
public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		StringBuffer sbf = new StringBuffer(str);
		sbf.reverse();
		String s = str+'|'+sbf;
		System.out.println("Mirror + joined: "+s);
	}
	

}
