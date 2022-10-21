package lab5;
import java.util.*;
public class Eh2 {
	
	public static void main(String[] args) throws InvalidNameException  {
		String firstName;
		String lastName ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		firstName=sc.nextLine();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter last name: ");
		lastName=sc1.nextLine();
		
		try{
			if(firstName.isEmpty()) {
				if(lastName.isEmpty()) {
					throw new InvalidNameException("User invalid");
				}else {
					System.out.println("first name: "+firstName);
					System.out.println("first name: "+lastName);
				}
			}
			
		}finally {
		
		}
		// TODO Auto-generated method stub

	}

}
