import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int n,a,b;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt();
		a= (n*(n+1)*(2*n+1))/6;
		b= (n*(n+1))/2;
		b= b*b;
		sum =Math.abs(a-b);
		System.out.println(sum);

	}

}
