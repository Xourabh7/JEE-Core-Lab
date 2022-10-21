package lab5;
import java.util.Scanner;	
public class Eh1 {
	public static void main(String[] args) throws InvalidAgeException {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter age: ");
			int n=sc.nextInt();
			if(n<15) {
				throw new  InvalidAgeException("Invalid age");		
				}
		}finally {
			
		}
	}

}
