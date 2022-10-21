package lab3;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: ");
		String str = sc.next();
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			int n = Integer.parseInt(temp);
			System.out.println(n);
			
			sum=sum+n;
			
			}
		System.out.println("Sum is: "+sum);

	}

}
